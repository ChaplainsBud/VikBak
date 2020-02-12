package com.matthew.sabrina_bakery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping("/croissant")
    public String france(){
        return "croissants";
    }
    @RequestMapping("/bagel")
    public String poland(){
        return "bagels";
    }
    @RequestMapping("/muffin")
    public String england() {
        return "muffins";
    }
}
