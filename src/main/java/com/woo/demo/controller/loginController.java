package com.woo.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @Value("${login}")
    private String login;


    @RequestMapping(value = "/login",method = RequestMethod.GET  )
    public String login(){
        return login;
    }
}
