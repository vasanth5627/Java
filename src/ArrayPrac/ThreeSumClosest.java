package ArrayPrac;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] arr,int target){
        Arrays.sort(arr);
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-2; i++) {
            int j = i+1;
            int k = arr.length-1;
            int temp = target-arr[i];
            while(j<k){
                int curr = Math.abs(arr[i]+arr[j]+arr[k]-target);
                System.out.println(curr);
                System.out.println(target-curr);
                if(target-curr>ans && curr!=target) ans = arr[i]+arr[j]+arr[k];
                if(arr[j]+arr[k]==temp){
                    return target;
                }
                if(arr[j]+arr[k]>temp){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,0};
        System.out.println(threeSumClosest(arr,100));
    }
}
