package com.dectrio.demo;

import org.springframework.stereotype.Component;

@Component
public class laptop {
    private int lid;
    private String brand;

    @Override
    public String toString(){
        return ""+lid+""+brand;
    } 

    
    public void compile(){
        System.out.println("Compile");
    } 
}
