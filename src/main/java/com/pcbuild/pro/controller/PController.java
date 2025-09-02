package com.pcbuild.pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PController {

    @GetMapping("/")
    public String index() {
        return "index"; 
    }

    @GetMapping("/signin")
    public String signin() {
        return "signin";
    }

        @Autowired
    private UserRepository userRepository;

    @GetMapping("/signup")
    public String signupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String signupSubmit(@ModelAttribute User user) {
        userRepository.save(user);
        return "signin";
    }
}