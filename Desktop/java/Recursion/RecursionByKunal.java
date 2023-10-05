package Recursion;

public class RecursionByKunal {
    public static void main(String[] args) {
        //Num(1);
   num1(5);
    }
    static void Num(int n){
        if(n==5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Num(n+1);

    }
    static void num1(int n){
        if(n==0)
            return;
        num1(n-1);
        System.out.println(n);
    }

}
