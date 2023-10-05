package LinearSearch;

import java.util.Arrays;
import java.util.Optional;

public class LinearSearchInString {
    public static void main(String[] args) {
        String str="chandan";
        char target='a';
        boolean ans=LinearSearch(str,target);
        System.out.println(ans);


    }
    static boolean LinearSearch(String str,char Target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(Target==str.charAt(i)){
                return true;
            }
        }

        return false;
    }
}
