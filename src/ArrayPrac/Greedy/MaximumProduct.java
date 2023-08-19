package ArrayPrac.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class MaximumProduct {
    static int maxProduct(int[] arr){
        if(arr.length==1) return arr[0];
        int mod=1000000007;
        ArrayList<Integer> al = new ArrayList<>();
        boolean positive = false;
        long product=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                al.add(arr[i]);
            }
            else if(arr[i]>0){
                product=(product*arr[i])%mod;
                positive = true;
            }
        }
        Collections.sort(al);
//        System.out.println(product);
//        System.out.println(al);
        if(al.size()%2==1) al.remove(al.size()-1);
        if(al.size()==0 && product ==1 && !positive) return 0;
        for (int i = 0; i < al.size(); i++) {
            product=(product*al.get(i))%mod;
        }

        return (int)product;
    }

    public static void main(String[] args) {
        int[] arr = {7, -2, 7, -1, 2, -3, -10, -2, -9, 6, -5, -10, 9, 4, -5, 6, 0, 2, -10, -5, -6, 1, -6, 6, -3, 7, 7, -9, -10, -4, -9, 4, 9, 10, 3, -7, -6, 6, 3, 7, -3, -2, -10, -2, 10, -3, -9, 0, 7, -1, -3, 5, -5, -4, -3, 2, 3, 2, -7, -8, 9, 10, 10, 2, 4, 2, -8, 2, -3};
        System.out.println(maxProduct(arr));
    }
}
