package Noncolabs;

//Question no 2:

import java.util.Arrays;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n= sc.nextInt();
        int[] arr=new int[n+1];
        int[] FinalArrays=Power(arr,n);
        System.out.println(Arrays.toString(FinalArrays));

    }
    static int[] Power(int[] arr,int n){
        if(n>=0){
            for(int i=0;i<=n;i++){
                 arr[i]= (int) Math.pow(2,i);
            }
        }
        return arr;
    }
}
