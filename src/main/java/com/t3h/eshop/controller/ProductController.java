package com.t3h.eshop.controller;

import com.t3h.eshop.service.ProductService;
import com.t3h.eshop.storage.entity.ProductEntity;
import com.t3h.eshop.storage.repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CartRepo cartRepo;

    @GetMapping("/")
    public ModelAndView product() {
        ModelAndView modelAndView = new ModelAndView("user/home");
        List<ProductEntity> products = productService.getAllProduct();
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @PostMapping("/add-to-cart")
    @ResponseBody
    public String addToCart(@RequestParam("productId") int productId,
                            @RequestParam("qty") int qty,
                            @RequestParam("userId") int userId) {
        cartRepo.addToCart(productId, qty, userId);
        return "Success";
    }
}