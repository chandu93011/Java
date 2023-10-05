package MultiThreading;
public class MyThread extends Thread {
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Child Thread");
        }
        //
    }
}
class ThreadTest {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        obj.start();
        //obj.start()-----> will create a child thread and Main thread one of them will execute the Child part and other will
        //execute the main part .

        //We can't say that the output will be same it wll vary JVM t JVM


        for(int i=1;i<10;i++){
            System.out.println("Parent Thread");
        }
    }
}


