package com.oops.AbstractDemo;

public class Son extends Parent{
    @Override
    void career(String name) {
        System.out.println("I am going to be "+ name);

    }

    @Override
    void parent(String name, int age) {
        System.out.println("I love "+ name +"she is "+age);
    }
}
