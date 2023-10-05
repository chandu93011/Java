package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans =sum();
//        System.out.println(ans);
        int ans=sum1(20,40);
        System.out.println(ans);
    }

    //pass the value when you are creating the methd

    static int sum1(int a ,int b){
        int sum1=a+b;
        return sum1;
    }
     static int sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1=in.nextInt();
        System.out.println("Enter the Second number ");
        int num2=in.nextInt();

        int sum=num1+num2;
        return sum;

     }
}
