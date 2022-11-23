package com.MyBlog.Site.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("/blog")
    public String BlogMain(Model model){
        return "blog-main";
    }
}
