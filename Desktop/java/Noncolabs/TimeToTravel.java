package Noncolabs;

import java.util.Scanner;

public class TimeToTravel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter speed");
        double speed=sc.nextDouble();
        double ans= Time(speed);
        System.out.println(ans);
    }
    static double Time(double speed){
        if(speed>=0){
        double distance=400.0;
        double time=distance/speed;
        return time;
        }
        return 0;
    }
}
