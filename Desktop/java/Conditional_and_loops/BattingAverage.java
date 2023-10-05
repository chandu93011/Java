package Conditional_and_loops;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the runs scored by the player");
        int runs= sc.nextInt();
        System.out.println("enter the no. of games played ");
        int noOFGames=sc.nextInt();
        System.out.println("Enter the no of games he was not out");
        int notOut=sc.nextInt();
        float BattingAverage=(runs)/(noOFGames-notOut);
        System.out.println("The batting average of that player is "+BattingAverage);

    }
}
