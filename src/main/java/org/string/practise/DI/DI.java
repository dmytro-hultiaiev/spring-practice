package org.string.practise.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class DI {
    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml")) {
            Car car = context.getBean("Car", Car.class);
            System.out.println("ID: " + car.getId() + " Model: " + car.getModel());
        }

    }
}
