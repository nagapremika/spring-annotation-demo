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
        Movie movie3 = context.getBean("getMovie3", Movie.class);       //Creating bean movie3
        movie3.display();
        System.out.println(movie1==movie2);     //Comparing two beans
        Movie movie4 = context.getBean("getMovie4", Movie.class);       //Creating bean movie4
        movie4.display();
        Movie movie5 = context.getBean("getMovie5", Movie.class);       //Creating bean movie5
        movie5.display();
        System.out.println(movie4==movie5);         //Comparing Two beans

    }
}
