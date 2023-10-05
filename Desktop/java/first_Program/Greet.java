package first_Program;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the name whom you want to greet");
        String name=Sc.nextLine();
        System.out.println("Hii mr"+" "+name+" "+"Good morning");
    }
}
