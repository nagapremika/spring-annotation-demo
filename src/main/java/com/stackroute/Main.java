package com.stackroute;


import com.stackroute.domain.Config;
import com.stackroute.domain.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
//        Bean creation using ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Movie movie1 = context.getBean("getMovie1", Movie.class);       //Creating bean movie1
        movie1.display();
        Movie movie2 = context.getBean("getMovie2", Movie.class);       //Creating bean movie2
        movie2.display();
    }
}
