package LinearSearch;

import java.util.Scanner;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6,7,8},
                {9,10,11,12}
        };
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Target");
        int target=sc.nextInt();
        boolean ans=SearchIn2D(arr,target);
        System.out.println(ans);
    }
    static boolean SearchIn2D(int[][] arr,int Target){
        if(arr.length==0)
            return false;
        for(int row=0;row< arr.length;row++){
            for (int col=0;col< arr[row].length;col++){
                if(arr[row][col]==Target){
                    return true;
                }
            }
        }

        return false;
    }
}
