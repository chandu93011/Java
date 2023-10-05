package com.oops.access;

public class ObjectDemo {

    //detail in hashmap
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo objectDemo=new ObjectDemo();
        ObjectDemo objectDemo1=new ObjectDemo();
        System.out.println(objectDemo.hashCode());
        System.out.println(objectDemo1.hashCode());
    }
}
