package com.oops.ExceptionHandling;

public class Main {

            /*
            *          object
            *       ______|______
            *      |             |
            *    Exceptions    Errors
            *   _______|______
            *   |             |
            * Unchecked    Checked
            *
            *
            * */


    public static void main(String[] args) {
        int a =5;
        int b=0;
        try {
            int c=a/b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        // what exception you want to throw should be above of parent Exception .if you
        //will not do so then the manual will not reflect because all the exception will be covered by the parent One .
        catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            System.out.println("this will always execute");
        }
        divide(5,0);


    }
    static void divide(int a,int b) throws ArithmeticException{
        if(b==0){
            System.out.println("please do not divide with zero");
        }
        System.out.println(a/b);
    }
}
