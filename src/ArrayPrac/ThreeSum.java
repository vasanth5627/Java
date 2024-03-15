package ArrayPrac;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] arr,int target){
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int tempTarget = target-arr[i];
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                if(arr[j]+arr[k]==tempTarget){
                    while(j<arr.length-2 && arr[j]==arr[j+1]) j++;
                    while(k>0 && arr[k]==arr[k-1]) k--;
                    ans.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;
                }
                else if(arr[j]+arr[k]>tempTarget) k--;
                else j++;
            }
            if(i<arr.length-2 && arr[i]==arr[i+1]) i++;
        }
        return ans.stream().toList();
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        threeSum(arr,0).forEach(e-> System.out.print(e+" "));
    }
}
