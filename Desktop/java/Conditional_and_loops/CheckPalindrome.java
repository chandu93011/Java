package Conditional_and_loops;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int temp=num;
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans=(ans*10)+rem;
            num=num/10;
        }
        if(temp==ans){
            System.out.println("It is palindrome");

        }else {
            System.out.println("It is not palindrome");

        }

    }
}
//quets
//