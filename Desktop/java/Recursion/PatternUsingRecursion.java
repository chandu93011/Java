package Recursion;

public class PatternUsingRecursion {
    public static void main(String[] args) {
    Pattern();
    }
    static void Pattern(){

        helper(4,0);
    }

    private static void helper(int i, int j) {
        if(i==0)
            return;
        if (j<i)
        {
            System.out.print("*");
            helper(i,j+1);
        }else {
            System.out.println();
            helper(i-1,j=0);
        }
    }
}
