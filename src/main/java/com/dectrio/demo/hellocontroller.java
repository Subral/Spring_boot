package com.dectrio.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class hellocontroller {
    private int aid;
    private String aname;
    private String tech;
    @Autowired
    private laptop laptop;

    public hellocontroller(){
        super();
        System.out.println("in constructer");
        laptop.compile();
    }
    public void show(){
        System.out.println("in show you");
        laptop.compile();
    }
}
