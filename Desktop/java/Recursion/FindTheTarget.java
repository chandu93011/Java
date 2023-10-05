package Recursion;

public class FindTheTarget {
    public static void main(String[] args) {
        int[] arr={1,3,6,7,8,9};
        System.out.println(Target(arr,9));

    }
    static boolean Target(int[] arr,int target){
        return helper(arr,target,0);
    }
    private static boolean helper(int[] arr, int target, int i) {
        if(i==arr.length)
            return false;
        if(arr[i]==target)
            return true;
        return helper(arr,target,i+1);
    }
}
