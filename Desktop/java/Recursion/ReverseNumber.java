package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        Reverse(12345);

    }
    static void Reverse(int n){
        if(n<=0)
            return;

        System.out.print(n%10);
        Reverse(n/10);
    }
}
