package ArrayPrac.Seacrching;

import java.util.Arrays;

public class BinarySearch {
    //returns index of target element
    static int binarySearch(int[] arr,int target){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>target){

                e=mid-1;
            }
            else if(arr[mid]<target){

                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }

    static int search(int[] arr ,int target, boolean fe) {
        int s = 0;
        int e = arr.length - 1;
        int fs = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > target) {
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                if (!fe) {
                    fs=mid;
                    e = mid - 1;
                } else{
                    fs=mid;
                    s = mid + 1;
                }

            }
        }
        return fs;
    }


        static int[] firstAndLast ( int[] arr, int target){
            boolean fe = false;
            int[] res = {-1, -1};
            res[0]=search(arr,target,fe);
            if (res[0] != -1) {
                fe = true;
                res[1]=search(arr,target,fe);
            }
            return res;
        }

        static int rotatedSortedArray(int[] arr, int target){

        int pivot = pivot(arr);
        if(pivot==-1){
            return binarySearch(arr,target);
        }
        else if(arr[pivot]==target) return pivot;
        else if(target>=arr[0]) return binarySearchp(arr,target,0,pivot-1);
        else return binarySearchp(arr,target,pivot+1,arr.length-1);


    }

    private static int binarySearchp(int[] arr, int target, int st, int ed) {
        int s = st;
        int e = ed;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>target){

                e=mid-1;
            }
            else if(arr[mid]<target){

                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int pivot(int[] arr){
        int s=0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]){

                return mid;
            }
            else if(s>0 && arr[mid]<arr[mid-1]){

               return mid-1;
            }
             if(arr[mid]>=arr[s]){

             s=mid+1;
            }
           else {

               e=mid;
             }
         }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,6,9,14,19,24,27};
        int[] arrr = {5,7,8,8,8,8,10};
        int[] arrp = {5,6,1,2,3,4};
        System.out.println(binarySearch(arr,14));
        System.out.println(Arrays.toString(firstAndLast(arrr,8)));
        System.out.println(pivot(arrp));
        System.out.println(rotatedSortedArray(arrp,6));
    }
}
