package ArrayPrac.Searching;

import java.util.Arrays;

public class BookAllocation {
    static int bookAllocation(int[] arr, int n){
        int s = Arrays.stream(arr).reduce((a,b)->a>b?a:b).getAsInt();
        int e = Arrays.stream(arr).sum();
        int ans = 0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isPossible(arr,mid,n)){
                ans = mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;

    }
    static  boolean isPossible(int[] arr, int mid, int n){
        int sum=0;
        int student = 1;
        for (int i = 0; i < arr.length; i++) {
           sum+=arr[i];
           if(sum>mid){
               student++;
               sum=arr[i];
           }
        }
        if(student <= n) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {12,34,67,90};
        System.out.println(bookAllocation(arr,2));
    }
}
