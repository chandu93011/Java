package Conditional_and_loops;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n= sc.nextInt();
        System.out.println("Enter the Second number ");
        int m= sc.nextInt();
        int loop=Math.max(n,m);
        int Max=0;
        for(int i=1;i<loop;i++){
            if(n%i==0 && m%i==0){
                Max=Math.max(Max,i);
            }
        }
        System.out.println("HCF is "+Max);
    }
}
