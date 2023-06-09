package ArrayPrac.Searching;

import java.util.Arrays;

public class SplitArrayLargestSum {
    static int splitArrayLargestSum(int[] arr, int k){
        int s = Arrays.stream(arr).reduce((a,b)->a>b?a:b).getAsInt();
        int e = Arrays.stream(arr).sum();
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            int parts = 1;
            int sum=0;
            int i=0;
            while(i<arr.length){
                sum+=arr[i];
                if(sum>mid){
                    sum=arr[i];
                    parts++;
                }
                i++;


            }


            if(parts==k){
                ans = mid;
                e=mid-1;
            }
            else if(parts<k){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }


        return s;
    }

    public static void main(String[] args) {
        int[] arr ={7,2,5,10,8};
        System.out.println(splitArrayLargestSum(arr,2));
    }
}
