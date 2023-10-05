package Recursion;

import java.util.ArrayList;

public class ReturnArraylistOfIndex {
    public static void  main(String[] args) {
        int[] arr={1,2,3,4,4,5};
        System.out.println(Index(arr,4));
    }
    static ArrayList<Integer> Index(int[] arr,int target){
        return helper(arr,target,0,new ArrayList<>());
    }
    private static ArrayList<Integer> helper(int[] arr, int target, int i,ArrayList<Integer> ls) {
        if(i==arr.length)
            return ls;
        if(arr[i]==target)
            ls.add(i);
        return helper(arr,target,i+1,ls);
    }
}
