package com.oops.Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new LinkedList<>();

        list2.add(34);
        list2.add(23);
        list2.add(67);
        System.out.println(list2);
    //ArrayList and Vector are similar but if you are using the thread then go fir Vector
        //because of synchronization  otherwise go for ArrayList execution is fast.
        List<Integer> vector=new Vector<>();
        vector.add(23);
        vector.add(34);
        vector.add(87);
        vector.add(67);
        vector.add(45);
        System.out.println(vector);


    }
}
