package first_Program;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Boolean b=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                b=false;
            }
        }
        if(b==true){
            System.out.println("Prime");
        }else {
            System.out.println("not prime");
        }
    }
}
