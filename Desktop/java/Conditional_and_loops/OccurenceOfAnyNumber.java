package Conditional_and_loops;

import java.util.Scanner;

public class OccurenceOfAnyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:-");
        long n= sc.nextLong();
        System.out.println("Enter the number which you want to count:-");
        int num= sc.nextInt();
        int count=0;

        while(n>0){
            int rem= (int) (n%10);
            if(rem == num){
                count++;
            }
                n=n/10;

        }
        System.out.println(count);


    }
}
