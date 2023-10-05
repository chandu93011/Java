package com.oops.staticExample;

public class StaticBlock {
    static int a=5;
    static int b;

         // b=a*5; static method will be accessed inside static context

    //will only run once , when the first object is created when the class is loaded first time
    static {
        System.out.println("I am in static block");
        b=a*10;
    }

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);


        StaticBlock.b+= 3;
        System.out.println(StaticBlock.a+" "+b);


        StaticBlock obj1=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);


    }
}
