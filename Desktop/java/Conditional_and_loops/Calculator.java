package Conditional_and_loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans = 0;
        int a;
        while(true){
            System.out.print("Enter the operator ");
            char op=sc.next().trim().charAt(0);
            if(op =='+' || op =='-' ||  op =='*' ||  op =='/' || op=='X' || op=='x' ){
                if (op =='+'){
                    if(ans==0){
                        System.out.print("Enter the two numbers number ");
                        a=sc.nextInt();
                        int b=sc.nextInt();
                        ans=a+b;
                        System.out.println(ans);
                    } else{
                        a=ans;
                        int b=sc.nextInt();
                        ans=a+b;
                        System.out.println(ans);
                    }
                }
                if(op =='-'){
                    if(ans==0){
                        System.out.print("Enter the two  numbers ");
                        a=sc.nextInt();
                        int b=sc.nextInt();
                        ans=a-b;
                        System.out.println(ans);
                    }else{
                        a=ans;
                        int b=sc.nextInt();
                        ans=a-b;
                        System.out.println(ans);
                    }
                }
                if(op =='*'){
                    if(ans==0){
                        System.out.print("Enter the two numbers ");
                        a=sc.nextInt();
                        int b=sc.nextInt();
                        ans=a*b;
                        System.out.println(ans);
                    }else{
                        a=ans;
                        int b=sc.nextInt();
                        ans=a*b;
                        System.out.println(ans);
                    }
                }
                if(op =='/'){
                    if(ans==0){
                        System.out.print("Enter the two numbers ");
                        a=sc.nextInt();
                        int b=sc.nextInt();
                        ans=a/b;
                        System.out.println(ans);
                    }else{
                        a=ans;
                        int b=sc.nextInt();
                        ans=a/b;
                        System.out.println(ans);
                    }
                }
                if(op=='X' || op=='x' ) {
                    break;
                }

            }else {
                System.out.println("Invalid operator");
            }
        }
        System.out.println("So the final answer is "+ ans);
    }
}
