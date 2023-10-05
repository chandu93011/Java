package first_Program;

import java.util.Scanner;

public class BitInTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two  numbers");
        int n= sc.nextInt();
        int m= sc.nextInt();
        int count=0;
        while(n>0 || m>0){
            if(n>0 && n%2==1){
              count++;
            }
            n=n/2;
            if(m>0 && m%2==1){
                count++;
            }
            m=m/2;
        }
        System.out.println(count);
    }
}
