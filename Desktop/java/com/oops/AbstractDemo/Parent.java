package com.oops.AbstractDemo;

public abstract class Parent {


 //  can't create the abstract constructor of abstract class
//    abstract Parent(){
//
//    }

    static void Hello(){
        System.out.println("hey how are you");
    }
    void Normal(){
        System.out.println("yur due is 500 ");
    }
    abstract void career(String name);
    abstract void parent(String name,int age);

}
