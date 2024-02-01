package GetSDEReady.Math;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] arr){
        int last = arr.length-1;
        if(arr[last]+1<10){
            arr[last] = arr[last]+1;
            return arr;
        }
        else{
            int c=1;
            for (int i = last; i >=0; i--) {
                if(arr[i]+c>9){
                    arr[i] = (arr[i]+c)-10;
                    c=1;
                }
                else{
                    arr[i] = arr[i]+c;
                    c=0;
                }
            }

            if(c!=0){
                int[] ans = new int[arr.length+1];
                ans[0] = c;
                for (int i = 0,k=1; i < arr.length; i++,k++) {
                    ans[k] = arr[i];
                }
               return ans;
            }
            return arr;
        }




    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
    }
}
