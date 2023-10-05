package Functions;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks= sc.nextInt();
        String result=Grades(marks);
        System.out.println(result);
    }
    static String Grades(int marks){
        String Grade=null;
        if(marks>=91 && marks<=100){
            Grade="AA";
        }
        if(marks>=81 && marks<=90){
            Grade="AB";
        }
        if(marks>=71 && marks<=80){
            Grade="BB";
        }
        if(marks>=61 && marks<=70){
            Grade="BC";
        }
        if(marks>=51 && marks<=60){
            Grade="CD";
        }
        if(marks>=41 && marks<=50){
            Grade="DD";
        }
        if(marks<=40){
            Grade="Fail";
        }
        return Grade;
    }
}
