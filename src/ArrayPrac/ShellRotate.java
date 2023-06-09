package ArrayPrac;

import java.util.Arrays;

public class ShellRotate {

    public static void reverse(int[] arr,int k){
        for (int i = 0; i < (arr.length-k)/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i-k];
            arr[arr.length-1-i-k] = temp;
        }
    }

    public static void rotate(int[] arr,int r){
        r=r% arr.length;

        reverse(arr,r);

        reverse(arr,0);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);

        System.out.println(Arrays.toString(arr));
    }
}
