package first_Program;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int perfectSquare=0;
        for(int i=0;i<=number;i++){
             perfectSquare= (int) Math.pow(2, i);
            if(number == perfectSquare){
                System.out.println("Multiple of 2");
            }
        }
    }
}
