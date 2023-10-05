package com.oops.Generic;

import java.util.Arrays;

public class CustomArrayListForGeneric<T> {
    private Object[] data; //it will only work for integer if we write the string inside it will give error
    //but in ArrayList<String> list=new ArrayList<>(); we can perform.
    private static int DEFAULT_SIZE=10;
    private int size = 0;

    public CustomArrayListForGeneric() {
        this.data=new Object[DEFAULT_SIZE];

    }
    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp=new Object[data.length*2];

        //copy the current item in the new array
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }


    private boolean isFull() {
        return size==data.length;
    }
    public T remove(int i){
        T removed=(T)data[--size];
        return removed;
    }
    public  T get(int index)
    {
        return (T) data[index];
    }
    public int size(){
        return size;
    }
    private void set(int index,T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayListForGeneric{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayListForGeneric<Integer> list =new CustomArrayListForGeneric<>();
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        list.remove(2);
        System.out.println(list);

        CustomArrayListForGeneric<String> list1=new CustomArrayListForGeneric<>();
    }
}
