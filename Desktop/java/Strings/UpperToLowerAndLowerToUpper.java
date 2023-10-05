package Strings;

import java.util.Scanner;

public class UpperToLowerAndLowerToUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        String result="";
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch = (char) (ch + 32);
                result = result + ch;
            } else {
                ch = (char) (ch - 32);
                result = result + ch;
            }
        }
        System.out.println(result);

    }
}
