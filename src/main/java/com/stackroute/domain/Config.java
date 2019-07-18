package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {       //Creates beans of actor and movie
    @Bean
    public Actor getActor1()
    {
        return new Actor("vijay","male",24);
    }
    @Bean
    public Actor getActor2()
    {
        return new Actor("Ajay","male",25);
    }
    @Bean
    public Actor getActor3()
    {
        return new Actor("Sharukh","male",50);
    }
    @Bean
    public Movie getMovie1()
    {
        Movie movie1=new Movie(getActor1());
        movie1.setActor(getActor1());
        return movie1;
    }
    @Bean
    public Movie getMovie2()
    {
        Movie movie2=new Movie(getActor2());
        movie2.setActor(getActor2());
        return movie2;
    }
    @Bean()
    public Movie getMovie3()
    {
        Movie movie3=new Movie(getActor3());
        movie3.setActor(getActor3());
        return movie3;
    }
    @Bean()
    public Movie getMovie4()
    {
        Movie movie3=new Movie(getActor3());
        movie3.setActor(getActor3());
        return movie3;
    }
    @Bean()
    public Movie getMovie5()
    {
        Movie movie3=new Movie(getActor3());
        movie3.setActor(getActor3());
        return movie3;
    }


}
