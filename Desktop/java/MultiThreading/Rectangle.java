package MultiThreading;

public class Rectangle {
    private int length;
    private int height;

    Rectangle() {
       length=5;
       height=10;
    }
    Rectangle(int l,int h){
        length=l;
        height=h;
    }
    public void Area(){
        System.out.println("Area "+(length*height));
    }
}
