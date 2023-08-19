package ArrayPrac.Greedy;

import java.util.Arrays;

public class MaximizeSum {
    static long maximizeSum(long[] arr, int k){
        Arrays.sort(arr);
        int i=0;
        while(i<arr.length && arr[i]<0) i++;
        int j=arr.length-1;
        while(i<j){
            long temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        //System.out.println(Arrays.toString(arr));
        long max = 0;
        long min = Integer.MAX_VALUE;;
        for( i=0;i<arr.length;i++){
            if(arr[i]>0){
                max+=arr[i];
                min = Math.min(min,arr[i]);
            }
            else if(k>0 && arr[i]<0){
                k--;
                max+=-(arr[i]);
                min = Math.min(min,-arr[i]);

            }
            else{
                max+=arr[i];
                min = Math.min(min,arr[i]);
            }
        }

        if(k%2==0){
            return max;
        }
        else{
            return max-min-min;
        }

    }

    public static void main(String[] args) {
        long[] arr={-9,-8,-7,-5,1,2,3,4};
        System.out.println(maximizeSum(arr,2));

    }
}
