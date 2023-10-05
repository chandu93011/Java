package Noncolabs;

import java.util.Scanner;



public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number the table you want");
        int number=sc.nextInt();
        Table(number);
    }
    static void Table(int n) {
            String table = null;
            for (int i = 1; i <= 10; i++) {
                int result = n * i;
                table = n + " * " + i + " = " + result;
                System.out.println(table);
            }
        }
}
