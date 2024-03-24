package com.t3h.eshop.controller;

import com.t3h.eshop.service.CategoryService;
import com.t3h.eshop.service.OrdersService;
import com.t3h.eshop.service.ProductService;
import com.t3h.eshop.storage.entiy.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.security.Principal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @GetMapping("/user-order")
    public ModelAndView userOrder(){
        return new ModelAndView("/menu/nav_bar_menu");
    }
    @GetMapping("/orders-view/{userId}")
    public ModelAndView getAll(Model model, @PathVariable Integer userId){
        List<Object[]> myOrders=ordersService.getOrdersByUserId(userId);
        ModelAndView modelAndView=new ModelAndView("user/my_orders");
        model.addAttribute("myOrders",myOrders);
        return modelAndView;
    }
}
