package Noncolabs;

import java.util.Scanner;

//Question no 3
public class CharacterIsSameOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two character");
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        int result= IsSame(ch1,ch2);
        System.out.println(result);
    }
    static int IsSame(int ch1,int ch2){
        int ans=0;
        if((ch1 >= 'a' && ch1<= 'z' ) && (ch2 >= 'a' && ch2 <= 'z')){
            ans=1;
        }
        else if((ch1 >= 'A' && ch1<= 'Z' ) && (ch2 >= 'A' && ch2 <= 'Z')){
            ans=1;
        }
        else if((ch1 >= 'A' && ch1<= 'Z' ) && (ch2 >= 'a' && ch2 <= 'z') || (ch1 >= 'a' && ch1<= 'z' ) && (ch2 >= 'A' && ch2 <= 'Z')){
            ans=0;
        }
        else{
            ans=-1;
        }

        return ans;
    }
}
