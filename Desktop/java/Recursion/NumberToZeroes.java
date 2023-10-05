package Recursion;

public class NumberToZeroes {
    public static void main(String[] args) {
        System.out.println(Steps(14));

    }
    public static int Steps(int n){
        return helper1(n,0);
    }

    private static int helper1(int n, int numberOfSteps) {
        if(n==0){
            return numberOfSteps;
        }
        if(n%2==0){
            return helper1(n/2,numberOfSteps+1);
        }
        return helper1(n-1,numberOfSteps+1);
    }
}
