package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> ls=new ArrayList<Integer>(10);
//        ls.add(6);
//        ls.add(7);
//        ls.add(8);
//        ls.add(9);
//        ls.add(61);
//        ls.add(7);
//        ls.add(8);
//        ls.add(9);
//        ls.add(61);
//        ls.add(6);
//        ls.add(7);
//        ls.add(8);
//        ls.add(9);
//        ls.add(61);
//        System.out.println(ls);
//        System.out.println(ls.contains(6));
//        ls.set(1,20);
//        ls.remove(5);
//
//        System.out.println(ls);
        //Input using loops
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
           ls.add(sc.nextInt());
        }
        //output
        for(int i=0;i<5;i++){
            System.out.print(ls.get(i)+" ");
        }

        /**
         *
         * POINTS
         * Size arraylist fills by some amount
         * old elements are copied in new one  and old one will be deleted
         *
         */

    }
}
