package Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int result=Factorial(n);
        System.out.println(result);

    }
    static int Factorial(int n){
        int factorial=1;
        while(n>0){
            factorial=n*factorial;
            n--;
        }
        return factorial;
    }
}
