package com.stackroute.domain;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemo;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {//Creates Actor and Movie bean
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
    @Bean
    public BeanPostProcessor beanPostProcessor() {
        BeanPostProcessorDemo demo = new BeanPostProcessorDemo();
        return demo;

    }

}
