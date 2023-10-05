package Sorting;

import java.util.Arrays;

public class QuickSort {
   /*
   *  pivot:choose any element =>after first path
   * all the element < pivot will be LHS of pivot .
   * & all the elements > pivot will be RHS of Pivot
   *
   *     what  ?
   *       5,4,3,2,1
   *
   *            1,3,2,  4 , 5
   *
   *
   * */
   public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr,0, arr.length-1);
       System.out.println(Arrays.toString(arr));
       Arrays.sort(arr); //this method is provided by java which uses quick sort
       System.out.println(Arrays.toString(arr));
   }
    static void sort(int[] nums,int low ,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end =high;
        int mid=(start+end)/2;
        int pivot=nums[mid];

        while (start<=end){
            while (nums[start]<pivot){
                start++;
            }
            while (nums[end]> pivot){
                end--;
            }
            if(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end] =temp;
                start++;
                end--;
            }

    }
        //now my pivot is at correct index ,please sort two halves now

        sort(nums,low,end);
        sort(nums,start,high);

    }
}
