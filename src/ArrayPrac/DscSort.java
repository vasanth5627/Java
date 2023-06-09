package ArrayPrac;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DscSort implements Sorting{

    public void sort(int[] arr) {
        Arrays.sort(arr);
        int j = arr.length-1;
        int i =0;
        while(i<j){
            int temp= arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        }




    @Override
    public void sort(String[] arr) {
       Arrays.sort(arr,(a,b)->b.compareTo(a));

    }


}

