package com.t3h.eshop.controller;

import com.t3h.eshop.service.UserService;
import com.t3h.eshop.storage.entiy.UserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user/view")
    public ModelAndView getAll(Model model){
        List<UserInfoEntity> list=userService.getAll();
        model.addAttribute("list",list);
        return new ModelAndView("admin/user/users");
    }
    @GetMapping("/user/new")
    public ModelAndView userNew(Model model){
        UserInfoEntity userInfoEntity=new UserInfoEntity();
        model.addAttribute("userInfoEntity",userInfoEntity);
        return  new ModelAndView("admin/user/add_user");
    }
    @PostMapping("/user/add")
    public String add(@ModelAttribute UserInfoEntity userInfoEntity, @RequestParam("file")MultipartFile file){
        if(!file.isEmpty()){
            try {
                String imageData= Base64.getEncoder().encodeToString(file.getBytes());
                userInfoEntity.setImage(imageData);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        userService.add(userInfoEntity);
        return "redirect:/user/view";
    }
    @GetMapping("/user/delete/{id}")
    public String delete(@PathVariable Integer id){
        userService.delete(id);
        return "redirect:/user/view";
    }
    @GetMapping("/user/detail/{id}")
    public ModelAndView detail(@PathVariable Integer id,Model model){
        UserInfoEntity userInfoEntity=userService.detail(id);
        model.addAttribute("userInfoEntity",userInfoEntity);
        return new ModelAndView("admin/user/user_profile");
    }
    @PostMapping("/user/update/{id}")
    public String update(@ModelAttribute UserInfoEntity userInfoEntity,@PathVariable Integer id){
        userService.update(id,userInfoEntity);
        return "redirect:/user/view";
    }
}
