package com.t3h.eshop.controller;

import com.t3h.eshop.service.CartService;
import com.t3h.eshop.service.CustomerProfileService;
import com.t3h.eshop.storage.entity.CartEntity;
import com.t3h.eshop.storage.entity.CustomerProfileEntity;
import com.t3h.eshop.storage.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CheckoutController {
    @Autowired private CustomerProfileService profileService;
    @Autowired private CartService cartService;
    @RequestMapping("/checkout")
    public String checkout(Model model){
        List<CartEntity> cart = cartService.getAllCart();
        model.addAttribute("cart",cart);
        List<CustomerProfileEntity> customer = profileService.getAllCus();
        model.addAttribute("customer",customer);
        return "user/checkout";
    }
}
