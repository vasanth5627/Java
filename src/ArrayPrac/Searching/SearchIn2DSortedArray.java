package ArrayPrac.Searching;

import java.util.Arrays;

public class SearchIn2DSortedArray {
    static int[] searchIn2DSortedArray(int[][] arr, int k){
        int i=0;
        int j = arr[0].length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==k) return new int[]{i,j};
            else if(arr[i][j]>k){
                j--;
            }
            else if(arr[i][j]<k){
                i++;
            }
        }

        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        System.out.println(Arrays.toString(searchIn2DSortedArray(arr,11)));
     }
}
