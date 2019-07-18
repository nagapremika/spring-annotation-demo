package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {    //Implements ApplicationContextAware,BeanNameAware
                                                                                        //BeanFactoryAware
    public Movie(Actor actor)
    {
        this.actor = actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }


    private Actor actor;
    public void display()
    {
        actor.display();
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Calls setBeanFatory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("calls setBeanName");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Calls setApplicationContext");
    }
}
