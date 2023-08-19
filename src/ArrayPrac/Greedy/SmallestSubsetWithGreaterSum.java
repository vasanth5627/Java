package ArrayPrac.Greedy;

import java.util.Arrays;

public class SmallestSubsetWithGreaterSum {
    static int minSubset(int[] arr){
        Arrays.sort(arr);
       // int sum = Arrays.stream(arr).reduce(0,(a,b)->a+b);
        int sum  = Arrays.stream(arr).sum();
        int j= arr.length-1;
        int rem=0;
        int count=0;
        while(j>=0){
           rem+=arr[j];
           count++;
           if(rem>sum-rem) return count;
           j--;

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 17, 7, 3};
        System.out.println(minSubset(arr));
    }
}
