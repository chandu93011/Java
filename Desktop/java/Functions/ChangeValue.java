package Functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeValue(int num[]){
        num[0]=99;
        //if you make change to the object by using the refrence only that obj wll be changed
    }
}
