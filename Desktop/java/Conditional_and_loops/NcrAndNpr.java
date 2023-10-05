package Conditional_and_loops;

import java.util.Scanner;

public class NcrAndNpr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n ");
        int n= sc.nextInt();
        System.out.println("Enter the r");
        int r=sc.nextInt();
        int nr=n-r;
        int fact1=1,factOfR=1,factOfNR=1;
        while(n>0){
            fact1=fact1*n;
            n--;
        }
        while(r>0){
            factOfR=factOfR*r;
            r--;
        }while (nr>0){
            factOfNR=factOfNR*nr;
            nr--;
        }
            int ncr=fact1/(factOfR*factOfNR);
            int npr=fact1/factOfNR;
            System.out.println("Ncr is equal to "+ncr);
            System.out.println("Npr is equal to "+npr);
    }
}
