package com.eucaly;

public class Person {

    String name;
    float weight;
    float hight;

    public Person(float weight, float height) {
        this.weight = weight;
        this.hight = height;
    }

    public Person(String name, float weight, float height) {
        this(weight, height);
        this.name = name;
    }

    public float bmi() {
        float bmi = weight / ( hight * hight);
        return bmi;
    };


    public void hello() {
        System.out.println("Hello World");
    }
}
