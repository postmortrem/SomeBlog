package com.MyBlog.Site.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/") //при переходе на главную страницу будет вызываться метод снизу
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home"; //хоум это название шаблона
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("title", "Инфо");
        return "about";
    }

}