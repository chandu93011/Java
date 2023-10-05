package MultiThreading;

public class AreaAndVolume {
    double length;
    double width;
    double height;

    AreaAndVolume(double length,double width){
        double length1 = length;
        double width1 = width;

    }
    AreaAndVolume(double length,double width,double height){
        double length2=length;
        double width2=length;
        double height2=length;


    }
    double Area(double length1, double width1){
        double area=length1*width1;
        return area;

    }
    double Volume(double length,double width,double height){
        double volume=length*width*height;
        return  volume;
    }
}

