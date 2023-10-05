package Conditional_and_loops;

import java.util.Scanner;

public class AddInterestAfterGivenMonths {
    //compound Interest we can also find
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the money which you given on interest");
        float principal=sc.nextInt();
        System.out.println("Enter percentage per year ");
        float p=sc.nextFloat();
        System.out.println("Enter the duration in years");
        int year=sc.nextInt();
        System.out.println("Enter the month after you want to add the interest into principal ");
        float mnth= sc.nextInt();
        float month=year*12;
        float percentage=p/12;
        for(int i=1;i<=month;i++){
            float interestAfterMonth=(principal*mnth*percentage)/100;
            if(i%mnth==0) principal = (principal + interestAfterMonth);
        }
        System.out.println("Principle value after "+ year+" years "+principal);

    }
}
