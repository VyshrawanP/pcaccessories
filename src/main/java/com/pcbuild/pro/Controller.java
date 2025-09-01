package com.pcbuild.pro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
    @GetMapping("/")
    public static index(){
        return "index";
    }
}
