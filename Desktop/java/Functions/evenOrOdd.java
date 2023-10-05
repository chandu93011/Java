package Functions;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String result=Even(n);
        System.out.println(result);

    }
    static String Even(int n){
        if(n%2==0){
            return "even";
        }
        return "odd";
    }
}
