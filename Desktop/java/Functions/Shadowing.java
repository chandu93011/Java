package Functions;

public class Shadowing {
    //Shadowing doesn't work for methods
    static int x=20;//this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //90
        int x;
        //System.out.println(x);//scope will begin after intiailzing the value
        x=40; //this variable will shadow the line 4 variable
        System.out.println(x);//40
        fun();

    }
    static void fun(){
        System.out.println(x);//90
    }
}
