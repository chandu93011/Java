package Functions;

public class Scope {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        {
            //int a=30  can't intialize again in hte blick already intialized
            a=30; //but we can change the value
             int c=34;
            //values inside the block will only be in the block
        }
        System.out.println(a);
        // System.out.println(c);//can't use outside
    }
    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}
