package SwitchCaseBreakAndContinue;

import java.util.Scanner;

public class Sweet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sweet= sc.next();

        switch (sweet){
            case "Gulab Jaamun":
                System.out.println("This is the best sweet if it is pure");
                break;
            case "Rasogulla":
                System.out.println("It is sweet and made of Milk .It is healthy ");
                break;
            case " Jilebi":
                System.out.println("National fruit of India !It is tasty when it is hot ");
            default:
                System.out.println("I am not aware about this sweet");
        }
    }
}
