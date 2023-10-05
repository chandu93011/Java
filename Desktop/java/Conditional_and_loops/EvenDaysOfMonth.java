package Conditional_and_loops;

import java.util.Scanner;

public class EvenDaysOfMonth {
    public static void main(String[] args) {
        int count=0;
        for(int day=1;day<=31;day++){
            if(day%2==0){
                count++;
            }
        }
        System.out.println("number of days Kunal will go outside with his friend is "+count);

    }
}
