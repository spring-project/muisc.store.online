package com.music.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {

    @RequestMapping("/")
    public String index() {
        return "home/index";
    }

}
