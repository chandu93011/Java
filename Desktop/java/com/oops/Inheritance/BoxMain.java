package com.oops.Inheritance;

public class BoxMain {
    public static void main(String[] args) {
//        Box box1=new Box(4,5,6);
//       Box box = new Box(new Box());
//       Box box2= new Box(4);
//       BoxWeight box3=new BoxWeight();

       BoxPrice box4=new BoxPrice(4,6,7,8,500);



//       System.out.println(box.l + " " + box.w +" "+ box.h);
//        System.out.println(box1.l + " " + box1.w +" "+ box1.h);
//        System.out.println(box2.l + " " + box2.w +" "+ box2.h);
//        System.out.println(box3.weight+" "+box3.w);
        System.out.println(box4.cost+" "+box4.l);
    }
}
