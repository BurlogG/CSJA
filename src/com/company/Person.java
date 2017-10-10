package com.company;

public class Person {
    protected int height;
    float weight;

    void say(String str) {
        System.out.println(str);
    }

    //construct

    Person(int height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    Person() {
    }

    //static

    public static int sum = 478;

    public static void write(String str) {
        System.out.println(str);
    }


}
