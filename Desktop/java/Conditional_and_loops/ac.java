package Conditional_and_loops;

import java.util.*;

class Accio{
    static int ASLoops6(String s){
        // write code here
        int len=s.length();
        long num=Long.parseLong(s);
        int sum=0;
        for(int i=0;i<len;i++) {
            long rem = num % 10;
            double power = 0;
            if (rem == 1) {
                power = Math.pow(2, i);
            }
            sum = sum + (int) power;
            num = num / 10;
        }
        return sum;
    }

}

public class ac {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Accio obj = new Accio();
        int ans=obj.ASLoops6(s);
        System.out.println(ans);
    }
}
