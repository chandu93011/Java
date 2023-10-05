package Conditional_and_loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String:-");
        String str= sc.nextLine();
        String temp=str;


//        char ch=sc.next().trim().charAt(2);
//        if(ch>='a' && ch<= 'z'){
//            System.out.println("Is lowerCase");
//        }else {
//            System.out.println("is Uppercase");
//        }

        int n=str.length();
        String result=" ";
        for(int i=0;i<n;i++){
            result=result+str.charAt(n-i);
        }
        if(temp==result){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }



    }
}
