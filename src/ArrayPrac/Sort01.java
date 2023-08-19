package ArrayPrac;

import java.util.Arrays;

public class Sort01 {
    static void sort01(int[] arr){
       int j = arr.length-1;
       while(j>=0){
           //System.out.println(Arrays.toString(arr));
           if(arr[j]==0){
               int i = j-1;
               while(i>=0 && arr[i]==0) i--;
               if(i>=0){
                   int temp = arr[i];
                   arr[i]=arr[j];
                   arr[j] = temp;

               }
               else{
                   break;
               }

           }
           else{
               j--;
           }
       }
    }

    static void sort01Adv(int[] arr){
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;

            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0};
        sort01Adv(arr);
        System.out.println(Arrays.toString(arr));

    }
}
