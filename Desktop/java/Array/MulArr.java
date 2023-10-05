package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MulArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ls=new ArrayList<>();
        //intialsation
        for(int i=0;i<3;i++){
            ls.add(new ArrayList<>());
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ls.get(i).add(sc.nextInt());
            }
        }
        System.out.println(ls);
    }
}
