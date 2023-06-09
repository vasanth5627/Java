package ArrayPrac.Searching;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortANearlySortedArray {
    static int minInK(int[] arr, int i, int j){
        int min = Integer.MAX_VALUE;
        int t =-1;
        for (int k = i; k <j; k++) {
           if(arr[k]<=min){
               t=k;
               min=arr[k];
           }
        }
        return t;
    }

    static void sortNearlySortedArray(int[] arr, int k){
        for (int i = 0; i < arr.length-1; i++) {
            int x;
            if(i<arr.length-k) {
                x = minInK(arr, i, i + k);
            }
            else x = minInK(arr,i,arr.length);

                 int temp = arr[i];
                 arr[i]=arr[x];
                 arr[x] = temp;


        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,6,7,5,9,8};
        sortNearlySortedArray(arr,3);
        System.out.println(Arrays.toString(arr));


    }
}
