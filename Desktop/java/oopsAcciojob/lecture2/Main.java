package oopsAcciojob.lecture2;

public class Main {
    public static void main(String[] args) {

   //if you have not passed any parameters in the constructor the doctor d1 will work because it will follow
        //default constructor  but after intialization you need to pass the parameter
 Doctor d1=new Doctor("doctor g",30,160,5,"hadiyokaodctor");
 d1.dance();


    }
}
class Person{
    String name;
    int age;
    int height;
    Person(String name,int age,int height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public void dance(){System.out.println("this is the dance function of person class");}}
class Doctor extends Person{
    int yearsOfExperience;
    String bodyPartExpert;
    public Doctor(String name,int age,int height,int yearsOfExperience,String bodyPartExpert){
        super(name,age,height);
        this.bodyPartExpert=bodyPartExpert;
        this.yearsOfExperience=yearsOfExperience;

    }

    public void dance(){
        System.out.println("this is the dance function of the doctor class");
    }

    public  void staticFunction(){
        System.out.println("this is a static function");
    }

    public void updateName(String newName,int age ,int height){
        super.name=newName;
    }
}
class Lawyer extends Person{
    int yearsofExperience;

    Lawyer(String name, int age, int height) {
        super(name, age, height);
    }
}