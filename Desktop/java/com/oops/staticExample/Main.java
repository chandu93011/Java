package com.oops.staticExample;

public class Main {
    public static void main(String[] args) {
        /*
        * WHY MAIN IS STATIC ?
        * Because we want to execute the function without creating the object of the class.
         * so we can say that static variable or Static methods belongs ts not with object.o clas
        * */
        Human chandan = new Human(22, "chandan", 23000, false);
        Human Aditya = new Human(23, "aditya", 200000, true);
        System.out.println(chandan.name);
        System.out.println(chandan.married);
        System.out.println(Aditya.salary);
        System.out.println(Human.population); //static variable it can be used directly without using reference
        System.out.println(Human.population);



       // greet();
        // can't access the non-static method cannot be referenced form the static context.
    }
    //the thing which is not static that belongs to object
    //and static belongs to class.
    void greet(){
        System.out.println("Hello world!");
        fun();
        //but inside non-static we can access static methods
    }
    // this is not dependent on object
    static void fun(){

   //    greet();// can't put not static method inside the static method


        //by creating instances we can access not static methods inside static
        Main obj=new Main();
        obj.greet();
    }
    void fun2(){
        greet();
    }
}
