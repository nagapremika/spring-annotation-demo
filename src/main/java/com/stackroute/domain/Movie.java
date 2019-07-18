package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

@Scope("prototype")     //Scope is prototype

public class Movie  {
    public Movie() {        //Default constructor

    }


    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

@Autowired
@Qualifier("getActor1")
    private Actor actor;
    public void display()
    {
        actor.display();
    }



}
