package first_Program;

import java.util.Scanner;

public class StringIsPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the String ");
        String isPalindrome= sc.nextLine();
        String temp=isPalindrome;
        String revStr="";
        for(int i=0;i<isPalindrome.length();i++){
            String ch= String.valueOf(isPalindrome.charAt(i));
            revStr=ch+revStr;
        }
        System.out.println("Reverse of the String :- "+revStr);
        if(revStr.equals(temp)){
            System.out.println("Palindrome");
        }else {
            System.out.println("not Palindrome");
        }

    }
}
