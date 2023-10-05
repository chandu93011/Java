package Recursion;

import java.util.Arrays;

public class RemoveA {
    public static void main(String[] args) {

        Remove("","chandan");
        String ans=Remove1("chandanYadav");
        System.out.println(ans);

    }
    static void Remove(String P,String up){
        if(up.isEmpty()){
            System.out.println(P);
            return;
        }
        char ch=up.charAt(0);

        if (ch == 'a') {
            Remove(P,up.substring(1));
        }else {
            Remove(P+ch,up.substring(1));
        }
    }
    static String Remove1(String up){
        if(up.isEmpty()){
            return " ";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return Remove1(up.substring(1));
        }else {
            return ch+Remove1(up.substring(1));
        }
    }
}
