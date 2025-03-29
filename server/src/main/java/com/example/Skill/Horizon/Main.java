package com.example.Skill.Horizon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.auth.policy.Principal;

@RestController
public class Main {

    
    @RequestMapping("/")
    public String home(){
        return "welcome!";

    }

    @RequestMapping("/User")
    public Principal user (Principal user){
        return user;

    }
    
}
