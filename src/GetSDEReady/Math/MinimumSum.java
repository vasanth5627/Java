package GetSDEReady.Math;

import java.util.Arrays;

public class MinimumSum {
    public static int minimumSum(int num){
        int[] arr = new int[4];
        int i=0;
       while (num>0){
           arr[i++] = num%10;
           num=num/10;
       }
        Arrays.sort(arr);
      return (arr[0]*10+arr[2])+(arr[1]*10+arr[3]);
    }

    public static void main(String[] args) {
        //input is always a 4-digit number
        System.out.println(minimumSum(4009));
    }
}
