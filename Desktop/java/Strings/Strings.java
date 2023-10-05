package Strings;

public class Strings {
    public static void main(String[] args) {

      String a="chandan";
      String b="chandan";

       //is both of them are equal ??
        // yes it store in heap so both of them are same .
        //but you on  change the value of one it will not change to the other one
        // because immutability

        System.out.println(a==b); //true

        String name = new String("chandan"); // created object
        String name1 = new String("chandan");
        System.out.println(name1==name);//false    // it will refer to the variable to their refrence
        System.out.println(name1.equals(name)); //true// it refers to the value
        System.out.println(name1.charAt(0)); //first character of the string

    }
}
