package com.test.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("in constructor" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "practice fast bowling for 15 minutes!!!!!!";
    }
}
