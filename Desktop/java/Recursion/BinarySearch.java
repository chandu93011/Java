package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,10,12,14,18};
        int target=12;
        System.out.println(BinarySearch(arr,target,0,arr.length-1));
    }
    static int BinarySearch(int[] arr,int target,int start, int end ){

        if(start > end){
            return -1;
        }
        int middle = start + (end-start)/2;
        if(arr[middle] == target){
            return middle;
        }
        if (target < arr[middle]){
          return BinarySearch(arr,target,start,middle-1);
        }
        return BinarySearch(arr,target,middle + 1,end);

    }
}
