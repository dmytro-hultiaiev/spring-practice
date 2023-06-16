package org.string.practise.DI;

public class Car {
    private int id;
    private String model;

    public void setId(int id) {
        this.id = id;
    }
    public void setModel(String model) {
        this.model = model;
    }
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
