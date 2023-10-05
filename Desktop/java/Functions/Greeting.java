package Functions;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name ");
        String name =sc.next();
        System.out.println(greeting(name));

    }
    static String greeting(String name){
        String message="hello "+name;
        return message;
    }


//    static void greeting(){
//        System.out.println("hello world");
//    }
}
