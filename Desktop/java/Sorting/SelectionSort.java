package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        int[] ans=Select(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Select(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex= GetMaxIndex(arr,0,last);
            int[] ans=Swap(arr,maxIndex,last);
        }

        return arr;
    }

    private static int GetMaxIndex(int[] arr, int start, int end) {
        int max=start;
        for(int i=start;i<end;i++){
            if(arr[start]<arr[i] ){
                max=i;
            }
        }
        return max;
    }
    private static int[] Swap(int[] arr,int first,int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        return arr;
    }


}
