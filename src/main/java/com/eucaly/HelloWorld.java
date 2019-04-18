package com.eucaly;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        Person p = new Person("Eucaly", 45.7f, 1.56f);
        p.hello();
        p.weight = 45.5f;
        p.hight = 1.56f;
        System.out.println(p.bmi());
        /*int age = 19;
        Integer age2 = 19;
        char c = '我';
        byte b = 120;
        float weight = 44.8f;
        float height = 1.56f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Eucaly";*/
    }
}
