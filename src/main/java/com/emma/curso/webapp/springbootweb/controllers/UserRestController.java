package com.emma.curso.webapp.springbootweb.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@RestController
@Controller
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    @ResponseBody
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("name", "Emmanuel");
        body.put("lastname", "Vasquez");
        return  body;

    }
}
