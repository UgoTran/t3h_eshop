package com.t3h.eshop.controller;

import com.t3h.eshop.service.CategoryService;
import com.t3h.eshop.storage.entiy.CategoryEntity;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    ServletContext context;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/view")
    public ModelAndView getAll(Model model, @Param("keyword")String keyword){
        List<CategoryEntity>list=categoryService.getAll();
        if (keyword!=null){
            list=categoryService.search(keyword);
        }
        model.addAttribute("list",list);
        return new ModelAndView("admin/category/categories");
    }
    @GetMapping("/category/new")
    public ModelAndView creatCategoryForm(Model model){
        CategoryEntity categoryEntity=new CategoryEntity();
        model.addAttribute("categoryEntity",categoryEntity);
        return new ModelAndView("admin/category/add_category");
    }
    @PostMapping("/add")
    public String add(@ModelAttribute CategoryEntity categoryEntity){
        categoryService.add(categoryEntity);
        return "redirect:/view";
    }
    @GetMapping("/category/delete/{id}")
    public String delete(@PathVariable Integer id){
        categoryService.delete(id);
        return "redirect:/view";
    }
    @GetMapping("/category/detail/{id}")
    public ModelAndView detail(@PathVariable Integer id,Model model){
        CategoryEntity categoryEntity=categoryService.detail(id);
        model.addAttribute("categoryEntity",categoryEntity);
        return new ModelAndView("admin/category/edit_category");
    }
    @PostMapping("/update/{id}")
    public String update(@ModelAttribute CategoryEntity categoryEntity,@PathVariable Integer id){
        categoryService.update(categoryEntity,id);
        return "redirect:/view";
    }
}
