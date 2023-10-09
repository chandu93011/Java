package oopsAcciojob.lectuer1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //p is the reference variable of the object in the memory
        Person p=new Person("Ram",100,180,"Everything");
        System.out.println(p.name+","+p.age);
        Person p1=new Person("Sakshi",21,160,"B.tech");
        System.out.println(p1.name+","+p1.age);
//Why we need constructor if we  have 100  attributes or more number of person  information it will very
//difficult task to inter one by one in the below manner

//        p.name="Ram";
//        p.age=100;
//        p.height=180;
//        p.qualification="Sarvagyani";

//        Person p1=new Person();
//        p1.name="Sakshi";
//        p1.age=21;
//        p1.height=160;
//        p1.qualification="B.tech";


        Scanner sc=new Scanner(System.in);
        String accountNum=sc.next();
        String name=sc.next();
        Double bal= sc.nextDouble();
        String accounttype=sc.next();


        BankAccount b=new BankAccount(accountNum,name,bal,accounttype);
        b.addMoney(50000);
        System.out.println("after deposit the  current balance is "+b.balance);
        System.out.println(b.checkBalance());
        b.withdrawMoney(30000);
        System.out.println(b.balance);



    }
}
 // this is a class :Blueprint of the object
class Person {
     public Person(String name,int age){
         this.name=name;
         this.age=age;
     }

     public Person(String name,int age,int height,String qualification){

         //this keyword is used to call the above parameters of the constructor
         //it is done to look code cleaner
         this(name,age);
        this.height=height;
        this.qualification=qualification;

     }

     public Person(String name, int age, int height, String qualification, String gender, String favouritePlaceToVisit, String personalHobby, String motherTounge) {
         this(name,age,height,qualification);
         this.gender = gender;
         this.favouritePlaceToVisit = favouritePlaceToVisit;
         this.personalHobby = personalHobby;
         this.motherTounge = motherTounge;
     }
    // these are the attributes that describe the particular class
    String name;
    int age;
    int height;
    String qualification;

    String gender;

    String favouritePlaceToVisit;
    String personalHobby;
    String motherTounge;

     //Methods : functions that objects of this class can call

    public void sing(String name){
        System.out.println("this person" + name + "want to sing a song");
    }
}

class BankAccount{
    public BankAccount(){

    }
    String accountNo;
    String accountName;
    double balance;
    String accountType;

    public  BankAccount(String accountNo,String accountName,Double balance,String accountType){
        this.accountNo=accountNo;
        this.accountName=accountName;
        this.balance=balance;
        this.accountType=accountType;

    }
    Double checkBalance(){
        return balance;
    }
    public  String addMoney(int money){
        balance=balance+money;
        return "added successfully, new balance is "+balance;
    }
    public String withdrawMoney(int money){
        if(balance>money) {
            balance = balance - money;
            return "withdraw successful ,current balance is " + balance;
        }
        else{
            return "balance insufficient, money in the account is "+balance;
        }
    }

}

