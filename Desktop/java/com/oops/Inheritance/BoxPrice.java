package com.oops.Inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(){
        super();
        this.cost=-1;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost=other.cost;

    }

    public BoxPrice(double h, double w, double l, double weight, double cost) {
        super(h, w, l, weight);
        this.cost = cost;
    }
    public  BoxPrice(double side,double weight,double cost){
        super(side,weight);
        this.cost=cost;

    }
    class A{
        public int n;
        A(){
            n=10;
        }
    }



}
