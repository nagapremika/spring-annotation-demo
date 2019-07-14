package com.stackroute;


import com.stackroute.domain.Config;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {
    public static void main(String[] args) {
//        Bean creation using ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Movie movie1 = context.getBean("getMovie", Movie.class);
        movie1.display();

        //        Bean creation using BeanFactory

        BeanFactory beanFactory = new AnnotationConfigApplicationContext(Config.class);
        Movie movie2 = beanFactory.getBean("getMovie", Movie.class);
        movie2.display();

        Movie movie3=beanFactory.getBean("getMovie",Movie.class);
        movie3.display();

    }
}
