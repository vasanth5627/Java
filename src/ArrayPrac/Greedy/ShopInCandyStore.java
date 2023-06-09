package ArrayPrac.Greedy;

import OOPS.InterfaceDemo.ExtendsDemo.A;

import java.util.ArrayList;
import java.util.Arrays;

public class ShopInCandyStore {
    static ArrayList<Integer> shopInCandyStore(int[] arr, int k){
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int total = 0;
        int i=0;
        int j=arr.length;
        while(i<j){
            total+=arr[i];
            j=j-k;
            i++;
        }
        al.add(total);
        i=0;
        j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
         total = 0;
         i=0;
         j=arr.length;
        while(i<j){
            total+=arr[i];
            j=j-k;
            i++;
        }

        al.add(total);
        return al;
    }

    public static void main(String[] args) {
        int[] arr= {3,2,1,4};
        System.out.println(shopInCandyStore(arr,2));
    }
}
