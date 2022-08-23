package com.example.firstservice;
import java.util.Random;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneratePasswordService {
    @RequestMapping(value = "{username}.generate",method = RequestMethod.GET)
    public String generate(@PathVariable("username") String username){
        Random random = new Random();
        int pass = (int)Math.floor(Math.random()*(999999999-10000000+1)+10000000);
        return "Hi,["+username+"]\n"+"Your new Password is "+pass;
    }
}

