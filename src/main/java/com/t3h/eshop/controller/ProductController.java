package com.t3h.eshop.controller;

import com.t3h.eshop.service.CategoryService;
import com.t3h.eshop.service.ProductService;
import com.t3h.eshop.storage.entiy.CategoryEntity;
import com.t3h.eshop.storage.entiy.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;
    @GetMapping("/product/view")
    public ModelAndView getAll(Model model){
        List<ProductEntity> list=productService.getAll();
        model.addAttribute("list",list);
        List<CategoryEntity> listCategory=categoryService.getAll();
        model.addAttribute("listCategory",listCategory);
        return new ModelAndView("admin/product/products");
    }
    @GetMapping("/product/new")
    public ModelAndView productAddForm(){
        ModelAndView modelAndView=new ModelAndView("admin/product/add_product");
        modelAndView.addObject("listCategory",categoryService.getAll());
        modelAndView.addObject("productEntity",new ProductEntity());
        return modelAndView;
    }
    @PostMapping("/product/add")
    public String add(@ModelAttribute ProductEntity productEntity){
        productService.add(productEntity);
        return "redirect:/product/view";
    }
    @GetMapping("/product/delete/{id}")
    public String delete(@PathVariable Integer id){
        productService.delete(id);
        return "redirect:/product/view";
    }
    @GetMapping("/product/detail/{id}")
    public ModelAndView detail(@PathVariable Integer id,Model model){
        ProductEntity productEntity=productService.detail(id);
        List<CategoryEntity>listCategory=categoryService.getAll();
        model.addAttribute("listCategory",listCategory);
        model.addAttribute("productEntity",productEntity);
        return new ModelAndView("admin/product/edit_product");
    }
    @PostMapping("/product/update/{id}")
    public String update(@PathVariable Integer id,@ModelAttribute ProductEntity productEntity){
        productService.update(id,productEntity);
        return "redirect:/view";
    }
}
