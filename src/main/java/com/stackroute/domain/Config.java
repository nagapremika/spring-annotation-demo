package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Actor getActor1()    //Actor Bean
    {
        return new Actor("vijay","male",24);
    }

    @Bean
    public Movie getMovie1()        //Movie Bean
    {
        Movie movie1=new Movie(getActor1());
        movie1.setActor(getActor1());
        return movie1;
    }



}
