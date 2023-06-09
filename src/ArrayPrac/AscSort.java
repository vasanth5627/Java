package ArrayPrac;

import java.util.Arrays;

public class AscSort implements Sorting{
    @Override
    public void sort(int[] arr) {
        Arrays.sort(arr);
    }



    @Override
    public void sort(String[] arr) {
       Arrays.sort(arr, (a,b)->a.compareTo(b));

    }


}
