package Noncolabs;

import java.util.Scanner;

public class DistanceBtwPillar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of pillars");
        int pillar=sc.nextInt();
        System.out.println("Enter the width of pillar in cm");
        int width=sc.nextInt();
        System.out.println("Enter the distance between two pillar in meter");
        int distance= sc.nextInt();
        Distance(pillar,width,distance);
    }
    static void Distance(int numOfPill,int width,int distance){
        if(numOfPill>=1 && (width>=10 && width<=30) && (distance>=10 && distance<=50)){
            int distanceBtPillar=(distance*100*numOfPill)+((numOfPill-2)*width);
            System.out.println(distanceBtPillar+" cm");
        }
    }
}
