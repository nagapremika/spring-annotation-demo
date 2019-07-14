package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Actor getActor1()
    {
        return new Actor("vijay","male",24);
    }

    @Bean
    public Movie getMovie1()
    {
        Movie movie=new Movie();
        movie.setActor(getActor1());
        return movie;
    }
    @Bean
    public Actor getActor2()
    {
        return new Actor("Ajay","male",30);
    }

    @Bean
    public Movie getMovie2()
    {
        Movie movie=new Movie(getActor2());
//        movie.setActor(getActor2());
        return movie;
    }


}
