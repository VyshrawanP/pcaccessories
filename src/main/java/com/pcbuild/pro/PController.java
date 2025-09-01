package com.pcbuild.pro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PController {

    @GetMapping("/i")
    public String index() {
        return "index"; // looks for src/main/resources/templates/index.html
    }

    @GetMapping("/signin")
    public String signin() {
        return "signin"; // looks for src/main/resources/templates/signin.html
    }
}