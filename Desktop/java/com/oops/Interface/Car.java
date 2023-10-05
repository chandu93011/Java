package com.oops.Interface;

public class Car implements Brake,Engine {
    @Override
    public void brake() {
        System.out.println("It has a normal brake like another car.");

    }

    @Override
    public void start() {
        System.out.println("Please press the key to start.");

    }

    @Override
    public void stop() {
        System.out.println("it stop like a normal car.");

    }

    @Override
    public void acc() {
        System.out.println("Accelerate like the normal car.");

    }
}
