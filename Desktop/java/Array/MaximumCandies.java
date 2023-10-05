package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
//        Boolean[] result = new Boolean[candies.length];
        List<Boolean> result = new ArrayList<>();
        int  max=Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if (extraCandies+candies[i]>=max){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        System.out.println(result);
    }
}
