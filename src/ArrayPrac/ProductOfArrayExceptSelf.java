package ArrayPrac;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    static int[] productExceptSelf(int[] arr){
        int ans =1;
        boolean zero  = false;
        boolean zeroAll = true;
        int count=0;
        int[] res = new int[arr.length];
        for (int e:arr) {
            if(e!=0){
                ans*=e;
                zeroAll = false;
            }
            else{
                zero = true;
                count++;
            }

        }
        if(zeroAll || count>1) ans = 0;
        int k=0;
        if(!zero){

            for (int e:arr) {
                res[k] = ans/e;
                k++;
            }
        }
        else{
            for (int e:arr) {
                if(e==0){
                    res[k]=ans;
                }
                else res[k]=0;
                k++;
            }
        }
        return res;

    }

    static int[] productExceptSelf1(int[] arr){
        int n = arr.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;

        for(int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * arr[i - 1];
        }
        System.out.println(Arrays.toString(pre));
        for(int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * arr[i + 1];
        }

        System.out.println(Arrays.toString(suff));

        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf1(arr)));
    }
}
