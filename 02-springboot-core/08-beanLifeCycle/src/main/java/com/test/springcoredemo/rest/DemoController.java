package com.test.springcoredemo.rest;

import com.test.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency
    private Coach myCoach;
   @Autowired
   public DemoController ( @Qualifier("cricketCoach") Coach theCoach){
       System.out.println("in constructor" + getClass().getSimpleName());
       myCoach = theCoach;
   }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    
}
