package com.oops.staticExample;

public class Human {
    int age ;
    String name ;
    int salary;
    boolean married;
    static long population;
    //if a member is defined as static it can be accessed without the
    //instantion of object it can be accessed directly without using the reference of any object


    public Human(int age,String name,int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population +=1;
    }

}
