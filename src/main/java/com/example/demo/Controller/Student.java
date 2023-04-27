package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {



    @GetMapping("/")
    public String kosong(){
        return "ini adalah kosong";
    }

    @GetMapping("/alfian")
    public String alfian(){
        return "ini adalah alfian";
    }

    @GetMapping("/alamsyah")
    public String alamsyah(){
        return "ini adalah alamsyah";
    }
}
