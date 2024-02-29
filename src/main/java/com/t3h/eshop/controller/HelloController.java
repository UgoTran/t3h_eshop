package com.t3h.eshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/Hello")
    public ResponseEntity hello(){
        return ResponseEntity.ok("heloo api, it works");
    }

    @GetMapping("/Hello2")
    public ResponseEntity hello2(){
        return ResponseEntity.ok("can phai xac thuc");
    }
}
