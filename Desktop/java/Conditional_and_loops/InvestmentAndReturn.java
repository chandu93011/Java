package Conditional_and_loops;

import java.util.Scanner;

public class InvestmentAndReturn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter money that you want to invest per month ");
        float investMoney=sc.nextInt();
        System.out.println("Enter the duration in years ");
        float year=sc.nextFloat();
        System.out.println("Enter the percentage per month which your invested equity will provide ");
        float rate=sc.nextFloat();
        int totalMoneyAfterYears=0;
        float month= year*12;
       while(month>0) {
           float profit=(totalMoneyAfterYears*rate)/100;
           totalMoneyAfterYears = (int) (totalMoneyAfterYears + investMoney +profit);
           month--;
       }
        System.out.println(totalMoneyAfterYears);
    }
}
