package LinearSearch;

public class EvenAndOddNumber {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        int ans=EvenOdd(nums);
        System.out.println(ans);
    }
    static int EvenOdd(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            String str= String.valueOf(nums[i]);
            if(str.length()%2==0){
                count++;
            }
        }

        return count ;
    }
}
