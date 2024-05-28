package com.test.springcoredemo.common;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("in constructor" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "practice fast bowling for 15 minutes!!!!!!";
    }
    //define our init method
    @PostConstruct
    public void domyStartUpStuff(){
        System.out.println("In doMyStartUpStuff(): " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void domyCleanUpStuff(){
        System.out.println("In doMyCleanUpStuff(): " + getClass().getSimpleName());
    }
}
