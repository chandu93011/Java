package Functions;

import java.util.*;
public class PrimeNumbersBetweenRange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        Numbers(n,m);
    }
    static void Numbers(int n,int m){
        int flag;
        for(int i=n;i<=m;i++){
            if(i==1 || i==0){
                continue;
            }
            flag=1;
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1)
                System.out.println(i);
        }
    }



}




