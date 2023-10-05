package Recursion;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(Sorted(arr));
    }
    static boolean Sorted(int[] arr){
        return helper(arr,0);
    }

    private static boolean helper(int[] arr, int i) {
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return helper(arr,i+1);
        }

        return false;
    }

}
