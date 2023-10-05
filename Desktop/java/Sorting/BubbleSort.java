package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={12,2,13,4,23,45,67,22,};
        int[] ans =Bubble(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Bubble(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
