package oopsAcciojob.lecture3;

public class Main {
    public static void main(String[] args) {
    Doctor doctor=new Doctor();
    doctor.stitches();
    Doctor doctor1=new Nurse();
    doctor1.stitches();
    }
}
class Person{
    public void stitches(){
    }
    public void dance(){
        System.out.println("this  is the person dance method");
    }
}
class Doctor{
    public void stitches(){
        System.out.println("this is doctor class");
    }
}
class Surgeon extends  Doctor{

    public void stitches() {
        System.out.println("this is surgeon  class");
    }
}
class Nurse extends Doctor{
    public void stitches(){
        System.out.println("this the nurse class ");
    }
}
class lawyer extends Person{
    public  void dance(){
        System.out.println("this is the lawyer class ");
    }
}
