package first_Program;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms");
        int n = sc.nextInt();
        int a = 0, b = 1;
        int c;
        if (n==2) {
             System.out.println("0");
             System.out.println("1");

         } else {
            System.out.println(0);
            System.out.println(1+" ");
            for(int i=3;i<=n;i++){
                c=a+b;
                System.out.println(c+" ");
                a=b;
                b=c;
            }
        }
    }

}


