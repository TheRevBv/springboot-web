package com.therevbv.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

// @RestController
@Controller
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("details")
    @ResponseBody
    public Map<String, Object> details() {
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("titulo", "User Details");
        bodyMap.put("nombre", "Joshua");
        bodyMap.put("apellido", "Morin");
        return bodyMap;
    }
}
