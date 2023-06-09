package ArrayPrac.SlidingWindow;

import java.lang.reflect.Array;
import java.util.*;

public class DistinctElementsInSizeK {

    static int checkDistinct(int[] arr, int i, int j){
        HashSet<Integer> hs = new HashSet<>();
        for(int k=i;k<j;k++){
            hs.add(arr[k]);
        }
        return hs.size();
    }
    static List<Integer> distinctElements(int[] arr, int k){
        List<Integer> al = new ArrayList<>();
        int i=0;
        int j=0;
        while(j<arr.length){
            j=i+k;
            al.add(checkDistinct(arr,i,j));
            i++;
        }
        return al;


    }

    static int checkDistinct1(int[] arr, Map<Integer,Integer> hm,int i,int j,int k){
        for (int l = i; l < j; l++) {

        }
        return 0;
    }


    static List<Integer> countDistinctInWindow(int[] arr, int k){
        Map<Integer,Integer> hm = new HashMap<>();
        List<Integer> al = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        al.add(hm.size());
        for (int i = k; i-k<arr.length-k; i++) {
            if(hm.get(arr[i-k])>1){
                hm.put(arr[i-k],hm.get(arr[i-k])-1);
            }
            else{
                hm.remove(arr[i-k]);
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            al.add(hm.size());
        }
        return al;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2,3};
     //   System.out.println(distinctElements(arr,4));
        System.out.println(countDistinctInWindow(arr,4));
    }
}
