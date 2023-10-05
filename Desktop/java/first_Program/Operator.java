package first_Program;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        float num2= sc.nextFloat();
        float num3=num1*num2+num2%num1/num2;
        System.out.println(num3);
    }
}
