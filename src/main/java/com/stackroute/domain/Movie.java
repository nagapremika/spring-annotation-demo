package com.stackroute.domain;

public class Movie  {
    public Movie() {    //Default constructor
    }

    public void setActor(Actor actor) {     //Sets actor
        this.actor = actor;
    }
    public Movie(Actor actor) {    // Parameterized constructor
        this.actor = actor;
    }

    private Actor actor;
    public void display()
    {
        actor.display();
    }



}
