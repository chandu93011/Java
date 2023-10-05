package Conditional_and_loops;

import java.util.Scanner;

public class AverageOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("the sum of the number will be "+sum);
        float average=sum/n;
        System.out.println("average of number is "+average);
    }
}
