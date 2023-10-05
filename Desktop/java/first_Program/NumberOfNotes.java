package first_Program;

import java.util.Scanner;

public class NumberOfNotes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int rupees=sc.nextInt();

        while(rupees>0){
            if(rupees>=100){
                int notesofhundred=rupees/100;
                System.out.println("notes of 100 "+notesofhundred);
                rupees=rupees%100;

            }
            if(rupees>=50){
                int notesOfFifty=rupees/50;
                System.out.println("notes of 50 "+notesOfFifty);
                rupees=rupees%50;
            }
            if(rupees>=20){
                int notesOfTwenty=rupees/20;
                System.out.println("notes of 20 "+notesOfTwenty);
                rupees=rupees%20;
            }

        }
    }
}
