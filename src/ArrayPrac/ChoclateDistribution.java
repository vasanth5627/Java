package ArrayPrac;

import java.util.Arrays;

public class ChoclateDistribution {
    static int choclateDistribution(int[] arr,int m){
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        for(int i=0;i+m<=arr.length;i++){
            int j = i+(m-1);
            mindiff = Math.min(mindiff,arr[j]-arr[i]);

        }
        return mindiff;
    }
    public static void main(String[] args) {
        int[] arr = {17,83,59,25,38,63,25,1,37};
        System.out.println(choclateDistribution(arr,9));
    }
}
