package com.test.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.springcoredemo.common.Coach;
import com.test.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
    
}
