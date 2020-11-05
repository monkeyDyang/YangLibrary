package com.yy.domain.controller.food;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {

    @RequestMapping("food")
    public String food(){
        return "food";
    }
}
