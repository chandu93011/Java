package Strings;

import java.io.*;
import java.util.*;

class Solution{
    static boolean special(int arr[][], int n){
        //Write code here
        boolean res=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j && arr[i][j] != 0 || (i+j)==n-1 && arr[i][j] !=0){
                    res=true;
                }else if(arr[i][j]==0 && i!=j || arr[i][j]==0 && (i+j)!=n-1){
                    res=true;
                }else{
                    res=false;
                    break;
                }

            }
            if(res==false){
                break;
            }else{
                continue;
            }

        }
        return res;

    }
}
class Main{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++)
                    matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            boolean ans = ob.special(matrix, n);
            System.out.println(ans);
        }
    }
}