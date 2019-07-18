package com.stackroute.domain;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {       //Cretes Actor and Movie Beans
    @Bean
    public Actor getActor()
    {
        return new Actor("Ajay","male",24);
    }
    @Bean
    public Movie getMovie()
    {
        Movie movie=new Movie();
        movie.setActor(getActor());
        return movie;
    }
    @Bean
    public BeanLifecycleDemoBean beanLifecycleDemoBean()
    {
        BeanLifecycleDemoBean beanLifecycleDemoBean=new BeanLifecycleDemoBean();
        beanLifecycleDemoBean.customInit();
        beanLifecycleDemoBean.customDestroy();
        return beanLifecycleDemoBean;
    }
}
