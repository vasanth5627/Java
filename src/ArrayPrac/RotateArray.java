package ArrayPrac;

import java.util.Arrays;

public class RotateArray {
    static void rotate(int[] arr){
        int temp = arr[arr.length-1];
        for (int i = arr.length-2; i>=0 ; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;

    }

    static void rotate(int[] arr,int k){
        while (k!=0){
            rotate(arr);
            k--;
        }
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
