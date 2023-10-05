package Array;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {

//        int[][] arr1={
//                {1,2,3},//0th index
//                {2,3,4},//1st index
//                {3,4,5}//2nd index
//        };

        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];//adding of colomn is not mandatory
        for(int row=0;row< arr.length;row++){
           for(int col=0;col < arr[row].length;col++){
               arr[row][col]= sc.nextInt();
           }
       }
        //output
        for(int row=0;row< arr.length;row++){
            for(int col=0;col < arr[row].length;col++){
                System.out.print(arr[row][col]+" ");

            }
            System.out.println();
        }
    }
}
