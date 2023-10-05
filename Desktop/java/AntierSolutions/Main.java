package AntierSolutions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1,0,5,6,0,9,-1,2,0
        int[] arr={1,0,5,6,0,9,-1,2,0};
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
            while(count<arr.length){
                arr[count++]=0;

            }



        }


    }


}
