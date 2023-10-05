package Building;

import java.util.Scanner;

public class Inch {
    private int inch;
    public void enterInches(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the inch");
        inch=sc.nextInt();
    }
    public int putInches(){
        return inch;
    }
}
class Feet{
    private int feet;
    public void getFeet(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the inch");
        feet=sc.nextInt();
    }
    public int putFeet(){
        return feet;
    }
}
class Width{
    private Feet f;
    private Inch i;
    public float width; //ASSOCIATION AND AGGREGATION I
    public float getWidth(){
        f=new Feet();
        i=new Inch();
        f.getFeet();
        i.enterInches();
        width=f.putFeet()+i.putInches()/12.0f;
        return width;
    }
}
class  Height{
    private Feet f;
    private  Inch i;
    public float height;

    public float getHeight() {
        f=new Feet();
        i=new Inch();
        f.getFeet();
        i.enterInches();
        height=f.putFeet()+i.putInches()/12.0f;
        return height;

    }
}
class Building{
    private Width w;
    private Height h;
    private float area;
    public float getArea(){
        area=w.getWidth()*h.getHeight();
        return area;
    }

}




