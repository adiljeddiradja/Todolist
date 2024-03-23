package com.enigma.Todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/todolist")
public class CarController {
    @GetMapping(value ="checkApi")
    public String checkApi(){
        return "Ohayou sekai";
    }

}
