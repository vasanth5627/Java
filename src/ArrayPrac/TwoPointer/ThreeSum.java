package ArrayPrac.TwoPointer;

import Interview.ThreadClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>> al  = new ArrayList<>();
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==0 &&(arr[i]!=arr[j] && arr[i]!=arr[k] && arr[j]!=arr[k])){
                       al.add(List.of(arr[i],arr[j],arr[k]));
                    }
                }
            }
        }
        return al;

    }

    public static List<List<Integer>> threeSum1(int[] arr) {
        List<List<Integer>> al = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=arr.length-1;i>1;i--){
            int j=0;
            int k=i-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k]==0){
                    al.add(List.of(arr[i],arr[j],arr[k]));
                    while(arr[j]==arr[j+1] && j<k){
                        j++;
                    }
                }
                else if(arr[i]+arr[j]+arr[k]>0){
                    k--;
                }
                else if(arr[i]+arr[j]+arr[k]<0){
                    j++;
                }
            }
        }
        return al;

    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum1(arr));
    }
}
