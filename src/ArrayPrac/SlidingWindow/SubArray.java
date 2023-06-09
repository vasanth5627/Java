package ArrayPrac.SlidingWindow;

import java.util.Arrays;

public class SubArray {
    static void subArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr,i,j+1)));

            }
        }
    }
    static void subArray1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        subArray(arr);
        System.out.println("*******************************************************");
        subArray1(arr);
    }
}
