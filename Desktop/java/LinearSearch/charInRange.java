package LinearSearch;

public class charInRange {
    public static void main(String[] args) {
        int[] arr={12,34,4,5,66,77,8884,2};
        int ans=Min(arr);
        System.out.println(ans);

    }
    static int Min(int[] arr){
        int min=100000;
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return  min;
    }
}
