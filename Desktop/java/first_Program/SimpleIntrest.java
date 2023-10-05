package first_Program;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the principle ,rate and time");
        int principle= sc.nextInt();
        System.out.println("Principle value is "+principle);
        int rate= sc.nextInt();
        System.out.println("Rate is "+rate+"%");
        int time= sc.nextInt();
        System.out.println("Duration in years "+time);

        int simpleIntrest=(principle*rate*time)/100;
        System.out.println(simpleIntrest);
    }
}
