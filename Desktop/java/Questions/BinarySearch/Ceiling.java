      package Questions.BinarySearch;

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr={12,14,16,18,20};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int ans=Ceiling(arr,target);
         System.out.println(ans);
     }
    static int Ceiling(int[] arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
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
        //start > end
        return arr[start];
    }
}
