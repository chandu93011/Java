package first_Program;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        float a=input.nextInt();
        System.out.println("Please enter the second number");
        float b=input.nextInt();
        float sum =a+b;
        System.out.println("The sum will be equals to"+" : "+sum);



    }
}
