package ArrayPrac;

import java.util.*;

public class PairSum {
    static List<int[]> pairSum(int[] arr, int s){
        List<int[]> al = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = s-arr[i];
           // System.out.println(comp);
            if(set.contains(comp)){
                int a = arr[i]>comp?comp:arr[i];
                int b = arr[i]>comp?arr[i]:comp;
           //     System.out.println(a+" "+b);
                al.add(new int[]{a,b});
            }
            else{
                set.add(arr[i]);
            }
        }
        Collections.sort(al,(a,b)->a[0]-b[0]);
        for (int[] i:
             al) {
            System.out.println(Arrays.toString(i));

        }
        return al;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(pairSum(arr,5));
    }

}
