package LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int[] arr=new int[10];
//        for(int i=0;i<10;i++){
//            arr[i]= sc.nextInt();
//
//        }
//        System.out.println("Enter the target value");
//        int target= sc.nextInt();
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//                System.out.println("The element is on the index "+target);
//                break;
//            }
//        }


        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  the target value ");
        int target= sc.nextInt();
        int ans= LinearSeaarch(arr,target);
        System.out.println(target+" is at index "+ ans);
    }
    static int LinearSeaarch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        //this line will execute when no element will be found
        return -1;
    }


}
