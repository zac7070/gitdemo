package com.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Getcontroller {

    @RequestMapping("/hello")
    public String Hello(){
        System.out.println("习近平");
        return "中国梦2";

    }

}
