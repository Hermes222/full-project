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
    private Coach anotherCoach;
   @Autowired
   public DemoController ( @Qualifier("cricketCoach") Coach theCoach,
    @Qualifier("cricketCoach") Coach theAnotherCoach){
       System.out.println("in constructor" + getClass().getSimpleName());
       myCoach = theCoach;
       anotherCoach = theAnotherCoach;
   }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    @GetMapping("/check")
    public String check(){
        return "comparing beans: mycoach == annotherCoach, " + (myCoach == anotherCoach);
    }
}
