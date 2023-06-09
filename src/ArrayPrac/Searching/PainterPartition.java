package ArrayPrac.Searching;

import OOPS.InterfaceDemo.ExtendsDemo.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PainterPartition {
    static int painterPartition(int[] arr, int n){
        int s = Arrays.stream(arr).reduce((a,b)->a>b?a:b).getAsInt();
        int e = Arrays.stream(arr).sum();
        int ans =0;
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
    static boolean isPossible(int[] arr, int mid, int n){
        int count = 1;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum>mid){
                count++;
                sum=arr[i];
            }
        }
        if(count<=n) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(painterPartition(arr,2));

    }
}
