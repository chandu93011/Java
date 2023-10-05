package BinarySearch;

import java.util.Scanner;

public class Notes {
    /*
    Step 1:- Take a sorted array
    arr=[2,4,6,9,11,12,14,20,36,48]

    1.FIND THE MIDDLE ELEMENT
    2.TARGET>MID=> SEARCH IN THE RIGHT
    ESLE SEARCH IN LEFT

    3.if middle element==target
    *
    * */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        System.out.println("Enter the Target to search");
        int target= sc.nextInt();
        int n=arr.length;
        int start=0;
        int end=9;
        while (start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                System.out.println("Target is found and it is at index "+mid);
                break ;
            }
            if(target>arr[mid]){
                start=mid+1;
            }if (target<arr[mid]){
                end=mid-1;
            }
        }
        System.out.println(target+" not in the given array");

    }
}

/*
Why Binary Search ?

*Q1].find the max number rof such comparison in worst case.

*
*
* */
