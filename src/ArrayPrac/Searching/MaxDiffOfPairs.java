package ArrayPrac.Searching;

import java.util.Arrays;

public class MaxDiffOfPairs {
    static int maxDiffPairs(int[] arr, int p){
        Arrays.sort(arr);
        int s = 0;
        int e = arr[arr.length-1]-arr[0];
        int ans = e;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isPossible(arr,mid,p)){
                ans = mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] arr, int mid, int p){
        int count=0;
        for (int i = 1; i < arr.length; i++) {
            if(Math.abs(arr[i]-arr[i-1])<=mid){
                count++;
                i++;
            }
        }
        return  count>=p;
    }

    public static void main(String[] args) {

    }
}
