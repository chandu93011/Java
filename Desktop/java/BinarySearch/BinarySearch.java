package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        boolean ans=BinarySearch(arr,target);
        System.out.println(ans);

    }
    static boolean BinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
       while(start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return true;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }

        }
        return false;
    }
}
