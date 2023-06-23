package com.springboot.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exeption")
public class ExeptionController {
    @GetMapping
    public void getRuntimeException(){
        throw new RuntimeException("getRuntimeException 메서드 호출");
    }
}
