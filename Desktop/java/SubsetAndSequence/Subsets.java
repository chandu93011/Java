package SubsetAndSequence;

import java.util.ArrayList;

public class Subsets {

    /*

*   Permutations & Combinations
*   Subsets ---> No adjacent collections
*   [3,5,9] --> [3],[5],[9],[3,5], [3,9],[3,5,9],[5,9]
*
*
*    Recursion and Iteration Approach

        This pattern of taking some elements & removing same it become as this subset pattern.
*
* */
    public static void main(String[] args) {
        subseq("","abc");
        System.out.println(subseq1("","abc"));


    }
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
    static ArrayList<String> subseq1(String p,String up){
        if(up.isEmpty()){
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseq1(p+ch,up.substring(1));
        ArrayList<String> right=subseq1(p,up.substring(1));

        left.addAll(right);
        return left;
    }

}
