package first_Program;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        int myInt1 = scanner.nextInt();
        int myInt2 = scanner.nextInt();
        int max=max(myInt1,myInt2,myInt);
        int pow= (int) Math.pow(max,2);
        int pow2=(myInt2*myInt2)+(myInt*myInt)+(myInt1*myInt);
        if(2*pow<pow2){
            System.out.println("1");
        }
        if(2*pow>pow2){
            System.out.println("2");
        }
        if(2*pow==pow2){
            System.out.println("3");
        }
    }
    static int max(int a, int b, int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if (c>max ){
            max=c;
        }
        return max;
    }

}
