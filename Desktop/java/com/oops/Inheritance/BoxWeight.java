package com.oops.Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        weight=45;
    }

    public BoxWeight(double h, double w, double l, double weight) {
        super(h, w, l);
        //used to initialise values present in parent class
        this.weight = weight;
    }

    public BoxWeight(BoxPrice other) {
    }

    public BoxWeight(double side, double weight) {
    }
}
