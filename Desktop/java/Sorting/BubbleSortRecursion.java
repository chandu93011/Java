package Sorting;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr={8,2,3,6,5,4,1};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    
    }
    static void Bubble(int[] arr){
        helper(arr,arr.length-1,0);
    }
    private static void helper(int[] arr, int i,int j) {
        if(i==0)
            return;
        if(j<i){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            helper(arr,i,j+1);
        }else{
            helper(arr,i-1,0);
        }
    }
}
