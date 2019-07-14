package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Actor getActor()
    {
        return new Actor();
    }
    @Bean
    public Movie getMovie()
    {
        Movie movie=new Movie();
        movie.setActor(getActor());
        return movie;
    }


}
