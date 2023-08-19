package Recurssion;

import java.util.Arrays;

public class MaxOfArray {
    static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1) return arr[idx];
        int max = maxOfArray(arr, idx+1);
        if(max>arr[idx]){
            return max;
        }else return arr[idx];
    }
    static void displayArray(int[] arr, int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx]+" ");
        displayArray(arr,idx+1);

    }
    static void displayArrayReverse(int[] arr, int idx){
        if(idx == arr.length) return;
        displayArrayReverse(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }
    static int fistIndexOccurance(int[] arr,int idx,int target){
        if(idx==arr.length) return -1;
        if(arr[idx]==target) return idx;
       return fistIndexOccurance(arr,idx+1,target);
    }
    static int lastIndexOccurance(int[] arr, int idx, int target){
        if(idx==arr.length) return -1;
        int ans =  lastIndexOccurance(arr,idx+1,target);
        if(ans==-1){
            if(arr[idx]==target){
                return idx;
            }
            else return -1;
        }
        else{
            return ans;
        }



    }
    static int[] allIndices(int[] arr,int idx,int target,int fsf){
        if(idx==arr.length){
            return new int[fsf];
        }
       if(arr[idx]==target) {
          int[] iarr  = allIndices(arr,idx+1,target,fsf+1);
          iarr[fsf] = idx;
          return iarr;
       }
       else{
           return allIndices(arr,idx+1,target,fsf);
       }


    }


    public static void main(String[] args) {
        int[] arr = {5,5,1,2,5};
//        System.out.println(maxOfArray(arr,0));
//        displayArray(arr,0);
//        System.out.println();
//        displayArrayReverse(arr,0);
        System.out.println(fistIndexOccurance(arr,0,10));
        System.out.println(lastIndexOccurance(arr,0,5));
        System.out.println(Arrays.toString(allIndices(arr,0,5,0)));
    }
}
