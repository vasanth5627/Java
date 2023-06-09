package ArrayPrac;

import java.util.Arrays;

public class ValidTriangle {
    static int validTriangle(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]>arr[k] && arr[i]+arr[k]>arr[j] && arr[k]+arr[j]>arr[i]) count++;
                }

            }
        }
        return count;
    }

    static int validTriangle1(int[] arr){
        int count=0;
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=2 ; i--) {
            int j=0;
            int k = i-1;
            while(j<k){
                if(arr[j]+arr[k]>arr[i]){
                    count+=k-j;
                    k--;

                }
                else j++;
            }
        }
        return count;
    }
    public static int triangleNumber(int[] arr) {
        Arrays.sort(arr);
        int count =0;
        for(int i=0;i<arr.length-2;i++){
            int j=i+1; int k = arr.length-1;
            while(j<k){
                if(arr[i]+arr[j]>arr[k]){
                    count+=k-j;
                    k--;

                }

                else{
                    j++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr= {2,2,3,4};
        System.out.println(triangleNumber(arr));
    }
}
