package com.t3h.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/")
    public String viewHomePage() {
        return "admin/index";
    }

    @GetMapping("/user/login")
    public String UserLogin(){
        return "user/user_login";
    }
    @GetMapping("/admin/login")
    public String AdminLogin(){
        return "admin/login/admin_login";
    }
    @GetMapping("/user/home")
    public String UserHome(){
        return "admin/user/user_profile";
    }
    @GetMapping("/admin/home")
    public String AdminHome(){
        return "user/my_profile";
    }

}
