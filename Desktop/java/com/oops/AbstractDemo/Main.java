package com.oops.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son=new Son();
        son.career("Doctor");

        Daughter daughter=new Daughter();
        daughter.career("Engineer");


        //we can't create the object of abstract class
        //Parent mom=new Parent();
        Parent.Hello();
        son.Normal();



    }
}
