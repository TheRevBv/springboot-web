package com.therevbv.springbootweb.controllers;

// import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("titulo", "User Details");
        model.addAttribute("nombre", "Joshua");
        model.addAttribute("apellido", "Morin");
        return "details";
    }

    /*
     * @GetMapping("/details")
     * public String details(Map<String, Object> model) {
     * model.put("titulo", "User Details");
     * model.put("nombre", "Joshua");
     * model.put("apellido", "Morin");
     * return "details";
     * }
     */
}