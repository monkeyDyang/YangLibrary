package com.yy.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/{pageName}")
    public String showPage(@PathVariable String pageName){
        return "/html/" + pageName;
    }
}
