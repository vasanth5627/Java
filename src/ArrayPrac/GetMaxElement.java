package ArrayPrac;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetMaxElement {

    //find maximum non-negative element not present in the array
    //reduce any element arr[i] to an integer x such that 0<=x<=arr[i]

        public static int mex(List<Integer> arr) {
            Collections.sort(arr);
           int mex = 0;
            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i)>=mex) mex++;
            }
            return mex;
        }

    public static void main(String[] args) {
        System.out.println(mex(Arrays.asList(1,2,2)));

    }
}
