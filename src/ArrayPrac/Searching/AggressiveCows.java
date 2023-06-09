package ArrayPrac.Searching;

import java.util.Arrays;

public class AggressiveCows {
    static int aggressiveCowsLinear(int[] arr, int n){
        Arrays.sort(arr);
        int max = arr[arr.length-1]-arr[0];
        int ans = 0;
        for (int i = 1; i <=max; i++) {
            if(isPossible(arr,i,n)){
                ans = i;
            }
        }
        return ans;
    }
    static int aggressiveCows(int[] arr, int n){
        Arrays.sort(arr);
        int s = 1;
        int e = arr[arr.length-1]-arr[0];
        int ans = 0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isPossible(arr,mid,n)){
                ans = mid;
                s=mid+1;

            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }

    static boolean isPossible(int[] arr, int mid, int n){
        int lastPlaced = arr[0];
        int count=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-lastPlaced>=mid){
                count++;
                lastPlaced = arr[i];
            }
            if(count==n) return true;
        }

        return false;

    }

    public static void main(String[] args) {
        int[] arr= {1,2,4,8,9};
        System.out.println(aggressiveCowsLinear(arr,3));
    }
}
