package com.stackroute.domain;

import org.springframework.context.annotation.Scope;

@Scope("prototype")     //Scope is prototype
public class Movie  {
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



}
