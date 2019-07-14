package com.stackroute;

import com.stackroute.domain.Config;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
    //Bean creation using AnnotationConfigurationApplicationContext
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Movie movie1 = context.getBean("getMovie", Movie.class);
        movie1.display();

        context.close();    //closes the context
    }
}
