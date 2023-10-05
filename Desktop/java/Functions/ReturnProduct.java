package Functions;


import java.util.Scanner;

public class ReturnProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int result=Product(a,b);
        System.out.print("Product "+result);

    }
    static int Product(int a,int b){
        int product=a*b;
        return product;
    }
}
