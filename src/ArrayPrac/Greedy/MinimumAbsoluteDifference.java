package ArrayPrac.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifference {
    static List<List<Integer>> minAbsDiff(int[] arr){
        List<List<Integer>> al= new ArrayList<>();
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                int abs = Math.abs(arr[i]-arr[j]);
                int max = arr[i]>arr[j]?arr[i]:arr[j];
                int min = arr[i]>arr[j]?arr[j]:arr[i];
                if(abs<ans){
                    ans = Math.abs(arr[i]-arr[j]);
                    al.clear();
                    al.add(List.of(min,max));
                }
                else if(Math.abs(arr[i]-arr[j])==ans){
                    al.add(List.of(min,max));
                }
            }
        }
        Collections.sort(al,(a,b)->a.get(0)-b.get(0));
        return al;
    }
    public static void main(String[] args) {
        int[] arr ={4,2,1,3};
        System.out.println(minAbsDiff(arr));

    }
}
