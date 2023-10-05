package Conditional_and_loops;

import java.util.Scanner;

public class AddUntil {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Max=0;
        System.out.println("Enter the number");
        int n= sc.nextInt();
//        int sum=0;
//        while(n!=0){
//            sum=sum+n;
//        }
//        System.out.println(sum);
        while(n!=0){
            Max=Math.max(Max,n);

        }
        System.out.println(Max);


    }
}
