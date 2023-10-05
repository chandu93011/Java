package com.oops.Polymorphism;

import com.oops.access.A;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circles circle =new Circles();
        Square square =new Square();
        Triangle triangle=new Triangle();

        square.area();
        circle.area();
        triangle.area();
        shape.area();
    }
}
