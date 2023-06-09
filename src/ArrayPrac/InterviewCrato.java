package ArrayPrac;

import java.util.Arrays;

public class InterviewCrato {
    public static int kthSmallest(int[] arr, int k){
        int ans =0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[k-1];
    }
    //find the kth smallest element in the array.
    public static void main(String[] args) {
        int[] arr = {4,7,8,1};

        int ans= kthSmallest(arr,2);
        System.out.println(ans);

//        int ans = Integer.MAX_VALUE;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<ans){
//                ans=arr[i];
//            }
//        }
//        System.out.println(ans);
    }



}
