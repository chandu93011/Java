package first_Program;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1= sc.nextInt();
        System.out.println("Enter the Second number");
        int n2= sc.nextInt();
        if(n1==n2){
            System.out.println(n1+" is equal to"+n2);
        } else if (n1>n2) {
            System.out.println(n1+" is greater than "+n2);
        }else {
            System.out.println(n2+" is greater than "+n1);
        }

    }
}
