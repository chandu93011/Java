package Questions.BinarySearch;


import java.util.ArrayList;

public class Questions {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,10,12,13,15};
        int result=Target(14,arr,0,arr.length-1);
        System.out.println(result);
    }
   static int Target(int target,int[] arr,int start,int end){
        if(start>end)   //to find the ceiling --> return the target or just greater than the target
        {

            //int[] left= Arrays.copyOfRange(arr,0,mid-1);
            ArrayList<Integer> list=new ArrayList<>();
            int min=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>target){
                    list.add(arr[i]);
                }
                else
                    continue;
            }
            for(int i=0;i<list.size();i++){
                min=Math.min(list.get(i),min);
            }
            return min;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<mid){
            Target(target,arr,start,mid-1);
        }
        return Target(target,arr,mid+1,end);
    }
}
