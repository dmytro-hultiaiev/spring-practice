package org.string.practise.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Car")
public class Car {
    @Value("${Car.id}")
    private int id;
    @Value("${Car.model}")
    private String model;
    public int getId() {
        return id;
    }
    public String getModel() {
        return model;
    }
    public void init(){
        System.out.println("Object init!");
    }
    public void destroy(){
        System.out.println("Object destroy!");
    }
}
