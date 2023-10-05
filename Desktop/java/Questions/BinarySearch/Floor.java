package Questions.BinarySearch;

import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        int[] arr={12,14,16,18,20};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int ans=Floor(arr,target);
        System.out.println(ans);

    }

    private static int Floor(int[] arr, int target) {
        if(target<arr[0]){
            return -1;
        }

        int end=arr.length-1;
        int start=0;
        while(end>=start){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return arr[mid];
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
        }
        return arr[end];
    }
}
