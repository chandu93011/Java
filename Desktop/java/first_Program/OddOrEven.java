package first_Program;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=input.nextInt();
        if(n%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }
}
