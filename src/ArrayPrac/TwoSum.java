package ArrayPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    //if exactly one solution and sorted array (asked for values)
    public static int[] twoSum(int[] arr, int target){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target) return new int[]{arr[i],arr[j]};
            if(arr[i]+arr[j]>target) j--;
            else i++;
        }
        return new int[]{-1,-1};
    }

    public static List<Integer[]> twoSumMultipleSol(int[] arr,int target){
        List<Integer[]> ans = new ArrayList<>();
      int i=0;
      int j=arr.length-1;
      while (i<j){
          if(arr[i]+arr[j]==target){
              while(i<arr.length-2 && arr[i]==arr[i+1]) i++;
              while(j>0 && arr[j]==arr[j-1]) j--;
              ans.add(new Integer[]{arr[i],arr[j]});
          }
          if(arr[i]+arr[j]>target) j--;
          else i++;
      }
      return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
        int[] brr = {2,2,5,5,4,7,7,7,7};
      twoSumMultipleSol(brr,9).forEach(e-> System.out.print(Arrays.toString(e)+" "));

    }
}
