package ArrayPrac;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,4,3,7,1};
        String[] str = {"def","kuy","abc","tuv"};
        Sorting s = new AscSort();
        s.sort(arr);
        System.out.println(Arrays.toString(arr));
        s.sort(str);
        System.out.println(Arrays.toString(str));
        Sorting s1  = new DscSort();
        s1.sort(arr);
        s1.sort(str);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
    }
}
