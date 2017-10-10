package com.company;

public class Person {
    int height;
    float weight;

    void say (String str) {
        System.out.println(str);
    }

    //construct

    Person (int height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    Person () {}
}
