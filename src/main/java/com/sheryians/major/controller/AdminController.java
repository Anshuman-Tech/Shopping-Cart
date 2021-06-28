package com.sheryians.major.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin") //routing
    public String adminPage(){
        return "adminHome"; // the html page
    }
    @GetMapping("/admin/categories")
    public String getCategories(){
        return "categories"; //the html page
    }
    @GetMapping("/admin/categories/add")
    public String addCategories(){
        return "categoriesAdd";
    }
}
