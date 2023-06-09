package ArrayPrac.Searching;

import java.util.Arrays;

public class FirstAndLast {
    static int[] firstAndLast(int[] arr,int target){
        return new int[]{findFrist(arr,target),findLast(arr,target)};

    }
    static int findFrist(int[] arr, int target){
        int ans = -1;
        int s = 0;
        int e=arr.length-1;
        while(s<=e){
            int mid  = s+(e-s)/2;
            if(arr[mid]>target){
                e=mid-1;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                ans = mid;
                e= mid-1;
            }
        }
        return ans;

    }

    static int findLast(int[] arr, int target){
        int ans = -1;
        int s = 0;
        int e=arr.length-1;
        while(s<=e){
            int mid  = s+(e-s)/2;
            if(arr[mid]>target){
                e=mid-1;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                ans = mid;
                s= mid+1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(firstAndLast(arr,8)));
    }
}
