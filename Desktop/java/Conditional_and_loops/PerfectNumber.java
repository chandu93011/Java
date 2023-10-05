package Conditional_and_loops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int temp=number;
        int result=0;
        for(int i=1;i<number;i++){   //28=14+7+4+2+1
            if(number%i==0){
                result=result+i;
            }
        }
        if(number==result){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }


    }



}
