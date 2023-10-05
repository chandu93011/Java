package Recursion;

import java.util.Scanner;

public class Recursion {
    //uses Stack DataStructure

//    public static void PrintNum(int n){
//        if(n==0)
//            return;
//        System.out.println(n);
//        PrintNum(n-1); // 5 4 3 2 1
//    }


//    public static  void Printnum1(int n){
//        if(n==6)
//            return;
//
//        System.out.println(n);
//        Printnum1(n+1); //1 2 3 4 5
//    }


//    public static  void Sum(int n,int i,int sum){
//        if(i==n){
//            sum=sum+i;
//            System.out.println(sum);
//            return;
//        }
//        sum=sum+i;
//        System.out.println(sum);
//        Sum(n,i+1,sum);
//    }


//    public static void Fact(int n,int fact){
//        if(n==1 || n==0){
//            System.out.println(fact);
//            return;
//        }
//        fact=fact*n;
//        Fact(n-1,fact);
//
//    }


//    public static void Fibonnaci(int n,int a,int b){
//        if(n==0)
//            return;
//        int c=a+b;
//        System.out.println(c);
//        Fibonnaci(n-1,a=b,b=c);
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num= sc.nextInt();
//        int a=0;
//        int b=1;
//        System.out.println(a);
//        System.out.println(b);
//        Fibonnaci(num-2,a,b);
//
//
//    }

//






    // HACKER RANK print 1 to 10  without loop VVI
public static void printNos(int N)
{
    if(N<=0)
    {
        return;
    }
    else
    {
        printNos(N-1);
        System.out.print(" "+N);
    }
}
public static void main(String[] args) {
    printNos(10);

}


}
