package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("Calls destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("properties are set");
    }
    public void customInit()
    {
        System.out.println("Calls init");
    }
    public void customDestroy()
    {
        System.out.println("Calls customDestroy");
    }
}
