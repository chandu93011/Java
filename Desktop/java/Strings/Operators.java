package Strings;

import java.util.ArrayList;

public class Operators  {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println("a"+0);//a0
        System.out.println('a'+0); //97
        System.out.println((char)('a'+1));
        System.out.println('A'+0); //65
        System.out.println("chandan"+new ArrayList<>());
        System.out.println('a'+new Integer(65));
        char c='J';
        if(c>=65 && c<=91)
            System.out.println("capital letter");
        else
        System.out.println("Small letter");
    }
}
