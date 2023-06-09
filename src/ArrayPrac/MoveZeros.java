package ArrayPrac;

import java.util.Arrays;

public class MoveZeros {
    static void moveZeros(int[] arr){
        int j = arr.length-1;
        while(j>=0){
            System.out.println(Arrays.toString(arr));
            System.out.println(j);
            while(j>=0 && arr[j]!=0){
                j--;
            }
            if(j>=0 && arr[j]==0){
                while(j<arr.length-1 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    j++;

                }
                System.out.println(Arrays.toString(arr));
                j--;
            }

        }

    }

    static void moveZeros1(int[] arr){
        int i=0;
        while(i<arr.length){
            while(i< arr.length && arr[i]!=0) i++;
            if(i== arr.length) break;
            int  j = i+1;
            while(j< arr.length && arr[j]==0) j++;
            if(j==arr.length) break;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;

        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeros1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
