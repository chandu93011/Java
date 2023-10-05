package Conditional_and_loops;

import java.util.Scanner;

public class DiscountOnProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the percentage of discount ");
        float percent= sc.nextFloat();
        System.out.println("Enter the price of the product ");
        float price=sc.nextFloat();
        float discount=(price*percent)/100;
        float netAmountToPay=price-discount;
        System.out.println("Net amount after discount "+netAmountToPay);


    }
}
