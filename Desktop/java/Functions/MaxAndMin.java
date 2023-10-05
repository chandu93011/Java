package Functions;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
       int largest= max(a,b,c);
       int smallest=min(a,b,c);
        System.out.println("max "+largest);
        System.out.println("min "+smallest);

    }
    static int max(int a, int b, int c){
        int max=a;
        if(b>max){
           max=b;
        }
        if (c>max ){
            max=c;
        }
        return max;
    }
    static int min(int a, int b, int c){
        int min=a;
        if(b<min){
            min=b;
        }
        if (c<min){
            min=c;
        }
        return min;
    }
}
