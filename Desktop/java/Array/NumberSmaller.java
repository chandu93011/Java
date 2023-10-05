package Array;

import java.util.Arrays;

public class NumberSmaller {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
       int[] result=new int[nums.length];
        for(int i=0;i<nums.length;){
            int count=0;
            for(int j=1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            result[i]=count;
            i++;
        }
        System.out.println(Arrays.toString(result));

    }

}
