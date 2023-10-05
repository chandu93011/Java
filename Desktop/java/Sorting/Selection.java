package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr={2,3,6,8,5,4,1};
        Select(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Select(int[] arr){
        helper(arr,arr.length,0,0);
    }

    private static void helper(int[] arr, int row, int col,int max) {
        if(row==0)
            return;
        if (col<row){
            if(arr[col]>arr[max])
               helper(arr,row,col+1,col);
            else {
                helper(arr, row, col + 1, max);
            }
        }else {
            int temp=arr[max];
            arr[max]=arr[row-1];
            arr[row-1]=temp;
            helper(arr,row-1,0,0);
        }
    }
}
