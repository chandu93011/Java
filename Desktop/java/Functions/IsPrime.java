package Functions;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String result=IsPrime(n);
        System.out.println(result);

    }
    static String IsPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return "Not Prime ";
            }
        }
        return "prime ";
    }
}
