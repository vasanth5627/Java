package ArrayPrac;

import java.util.Arrays;

public class RotateBy90 {
    static void transpose(int[][] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }
    }

    static void reverse(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[i].length/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[i].length-j-1];
                arr[i][arr[i].length-j-1] = temp;
            }
        }
    }

    static int[][] rotateBy90(int[][] arr){
        int[][] brr = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                brr[j][arr.length-1-i] = arr[i][j];
            }
        }
        return brr;
    }

    public static void main(String[] args) {
        int[][] arr = {{5,2,1},{9,6,2},{4,7,12}};
        transpose(arr);
        reverse(arr);
        for(int[] i: arr)
        System.out.println(Arrays.toString(i));

    }
}
