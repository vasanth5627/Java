package ArrayPrac;
import java.util.*;
public class MergeIntervals {
    static int[][] mergeIntervals(int[][] arr){
        //sort the array based on the start time
        int[][] ans = new int[arr.length][2];
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
        ans[0]=arr[0];
        int i = 1;
        int k=0;

        while(i<arr.length){
            if(arr[i][0]<=ans[k][1]){
                ans[k][1]=Math.max(arr[i][1],ans[k][1]);
                i++;
            }
            else{
                k++;
                ans[k]=arr[i];
            }
        }
        return Arrays.copyOfRange(ans,0,k+1);

    }
    public static void main(String[] args) {
        int[][] arr = {{1,3},{8,10},{6,9},{2,5},{11,15},{12,19}};
        int[][] ans = mergeIntervals(arr);
        for (int[] i : ans) {
            System.out.println(Arrays.toString(i));
        }




    }
}
