package com.yurr.springstudy.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
    // expose a new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "run a hard 5k";
    }
    //expose mew endpoint
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "your lucky day";
    }

}
