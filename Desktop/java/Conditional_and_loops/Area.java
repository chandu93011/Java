package Conditional_and_loops;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        //area of triangle =1/2(*b*h)
        float r= sc.nextFloat();
        float area= (float) ((3.141)*(r*r));
        System.out.println(area);

    }
}
