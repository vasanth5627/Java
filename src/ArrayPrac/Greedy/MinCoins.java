package ArrayPrac.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinCoins {
    static List<Integer> minCoins(int[] arr, int sum){
        List<Integer> al = new ArrayList<>();
        Arrays.sort(arr);
        int i=0;
        int j =arr.length-1;
        while(i!=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        int k=0;
        while(k<arr.length || sum!=0){
            if(arr[k]<=sum){
                sum-=arr[k];
                al.add(arr[k]);
            }
            else{
                k++;
            }
        }
        return al;
    }


    public static void main(String[] args) {
        int[] arr = {2000,100,500,20,50,10,5,2,1};
        System.out.println(minCoins(arr,147));

    }
}
