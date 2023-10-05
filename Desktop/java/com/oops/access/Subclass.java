package com.oops.access;

public class Subclass extends A{
    public Subclass(int num, String name, int[] arr) {
        super(num, name, arr);
    }

    public static void main(String[] args) {
        Subclass obj=new Subclass(34,"Aditya",new int[45]);
        int num1 = obj.num;
    }


}
