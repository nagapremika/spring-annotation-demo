package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {
    @Value("Vijay")
    public void setName(String name) {
        this.name = name;
    }

    @Value("Male")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Value("24")
    public void setAge(int age) {
        this.age = age;
    }
    public void display()
    {
        System.out.println("name="+this.name+" gender="+this.gender+" age="+this.age);
    }

    private String name;
    private String gender;



    private int age;
}
