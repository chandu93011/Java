package com.oops.Generic;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private static int[] data; //it will only work for integer if we write the string inside it will give error
    //but in ArrayList<String> list=new ArrayList<>(); we can perform.
    private static int DEFAULT_SIZE=10;
    private int size = 0;

    public CustomArrayList() {
        this.data=new int[DEFAULT_SIZE];

    }
    public void add(int num){
        if(this.isFull()){
           resize();
        }
       data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[data.length*2];

        //copy the current item in the new array
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }


    private boolean isFull() {
        return size==data.length;
    }
    public int remove(){
        int removed=data[--size];
        return removed;
    }
    public  int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    private void set(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data="+Arrays.toString(data)+
                "size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list =new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println(list);

    }
}
