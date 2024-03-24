package com.t3h.eshop.controller;

import com.t3h.eshop.service.CartService;
import com.t3h.eshop.storage.entity.CartEntity;
import com.t3h.eshop.storage.entity.CustomerProfileEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CartController {
    @Autowired private CartService cartService;
    @RequestMapping("/cart")
    public String cart(Model model){
        List<CartEntity> cart = cartService.getAllCart();
        model.addAttribute("cart",cart);
        return "/user/cart";
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public ResponseEntity deleteCart(@RequestParam("cart_id") int cart_id ){
        cartService.deleteCart(cart_id);
        return ResponseEntity.ok("Delete Success");
    }

}
