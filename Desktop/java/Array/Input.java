package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] arr= new int[5];
        int [] arr1={12,3,4,4,5};


        //input using loops
        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }




        String[] str=new String[5];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
        str[1]="chandan";
        System.out.println(Arrays.toString(str));
    }
}

