package com.example.firstservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathService {
    @RequestMapping(value = "/add/{number1}/{number2}" ,method = RequestMethod.GET)
    public double add(@PathVariable("number1") double number1,@PathVariable("number2") double number2){
        return number1+number2;
    }

    @RequestMapping(value = "/minus/{number1}/{number2}" ,method = RequestMethod.GET)
    public double minus(@PathVariable("number1") double number1,@PathVariable("number2") double number2){
        return number1-number2;
    }
    @RequestMapping(value = "/multiply" ,method = RequestMethod.GET)
    public double mulitiply(@RequestParam("number1") double number1,@RequestParam("number2") double number2){
        return number1*number2;
    }
    @RequestMapping(value = "/divide" ,method = RequestMethod.GET)
    public double divide(@RequestParam("number1") double number1,@RequestParam("number2") double number2){
        return number1/number2;
    }


}
