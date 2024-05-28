package com.test.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "spend 30min in batting practice";
    }
}
