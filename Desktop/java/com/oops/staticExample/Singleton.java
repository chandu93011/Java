package com.oops.staticExample;

public class Singleton { // Singleton means you can create only one object
    private Singleton(){

    }
    private static Singleton instance;
    public static Singleton getInstances(){

        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
