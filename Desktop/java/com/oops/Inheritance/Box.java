package com.oops.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;


    }
    //cube
    Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;

    }
    Box(double h,double w,double l){
        this.h=h;
        this.l=l;
        this.w=w;
    }
    Box(Box old){ //copy constructor
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }

}
