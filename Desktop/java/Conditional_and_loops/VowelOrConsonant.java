package Conditional_and_loops;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        String s2="aeiouAEIOU";
        int i;
        for(i=0;i<10;i++){
            String s= String.valueOf(s2.charAt(i));
            if(s.equals(string)){
                break;
            }
            else{
                continue;
            }
        }
        if (i<10){
            System.out.println("Vowel");
        }else{
            System.out.println("consonant");
        }

    }
}
