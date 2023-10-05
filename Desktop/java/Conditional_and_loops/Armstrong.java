package Conditional_and_loops;

import java.util.Scanner;

public class Armstrong {             //153=(1*1*1)+(5*5*5)+(3*3*3)=153 <---armstrong number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        String Str= sc.next();
        int length=Str.length();
        int number= Integer.parseInt(Str);
        int temp=number;
        int armstrong=0;
        while (number>0){
             int rem=number%10;
             armstrong= (int) (armstrong+Math.pow(rem,length));
             number=number/10;
        }
        if(armstrong==temp){
            System.out.println("It is an armstrong number ");
        }else {
            System.out.println("not armstrong");
        }

    }
}
