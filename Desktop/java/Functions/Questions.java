package Functions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));

    }
    static boolean isPrime(int n){
    for(int i=2;i<n;i++){
        if (n%i==0){
         return false;
        }
    }
        return true;
    }

}

