package org.string.practise.DI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.string.practise.SpringConfiguration;

public class DI {
    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class)) {
            Car car = context.getBean("Car", Car.class);
            System.out.println("ID: " + car.getId() + " Model: " + car.getModel());
        }

    }
}
