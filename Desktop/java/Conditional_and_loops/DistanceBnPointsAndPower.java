package Conditional_and_loops;

import java.util.Scanner;

public class DistanceBnPointsAndPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x1= sc.nextInt();
        double x2= sc.nextInt();
        double y1= sc.nextInt();
        double y2= sc.nextInt();
       double distance=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
//       double num=Math.sqrt(18);
//        System.out.println(num);
        //To Know the power in the java
        float pow= (float) Math.pow(x1,x2);
        System.out.println(pow);
        System.out.println(distance);

    }

}
