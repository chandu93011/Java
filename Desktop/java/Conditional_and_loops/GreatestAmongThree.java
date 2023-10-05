package Conditional_and_loops;

import java.util.Scanner;

public class GreatestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        if (a > b && a > c) {
//            System.out.println(a + " is the greatest number ");
//        } else if (b > a && b > c) {
//            System.out.println(b + " is the greatest number ");
//        } else if (c > a && c > b) {
//            System.out.println(c + " is the greatest number ");
//        }
//


//        int max=a;
//        if(b>max){
//            max=b;
//        }if (c>max) {
//            max=c;
//
//        }
//        System.out.println(max);





        int Max=Math.max(a,Math.max(b,c));
        System.out.println(Max);
   }
}
