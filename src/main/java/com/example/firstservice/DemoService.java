package com.example.firstservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoService {
    @RequestMapping(value = "/hello",method= RequestMethod.GET)
    public String hello(){
        return "Hello World";
    }
}
