package first_Program;

import java.util.Scanner;

public class RupeeToUsd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the amount in Rupee");
        float rupee= sc.nextFloat();
        float usd=rupee/81;
        System.out.println("you will get "+usd +" usd for "+rupee+" rupees");
    }
}
