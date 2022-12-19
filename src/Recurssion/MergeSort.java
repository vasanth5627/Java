package Recurssion;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int s, int e){
        if(s<e){
            int mid = s+(e-s)/2;
            mergeSort(arr,s,mid);
            mergeSort(arr,mid+1,e);
            merge(arr,s,mid,e);

        }
    }
    public static  void merge(int[] arr , int s , int mid, int e){
        int[] temp = new int[e-s+1];
        int i=s;
        int j=mid+1;
        int k=0;
        while(i<=mid &&j<=e){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=e){
            temp[k++] = arr[j++];
        }
        for (int l = s; l <= e; l++) {
            arr[l]=temp[l-s];
        }

    }

    public static void main(String[] args) {
        int[] arr= {5,4,6,2,1,-20};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
