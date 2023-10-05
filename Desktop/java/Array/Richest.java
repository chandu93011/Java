package Array;

import java.util.Scanner;

public class Richest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];//adding of colomn is not mandatory
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        int max=0;
        int sum=0;
        for (int row = 0; row < arr.length;) {
            for (int col = 0; col < arr[row].length; col++) {
                sum=sum+arr[row][col];

            }
            max=Math.max(sum,max);
            row++;
            sum=0;
        }
        System.out.println(max);

    }
}
