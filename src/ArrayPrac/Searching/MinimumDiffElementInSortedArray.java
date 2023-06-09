package ArrayPrac.Searching;

public class MinimumDiffElementInSortedArray {
    static int minDiffele(int[] arr, int target){
        int x = binarySearch(arr,target);
        if(x==-1) return 0;
        if(arr[x]==target) return arr[x];
            if(x>0 && x< arr.length){
               int r =  arr[x]-target;
               int l = target-arr[x-1];
               return r<l?r:l;
        }else {
                return arr[x];
            }

    }

    static int binarySearch(int[] arr, int target){
        int s =0;
        int e=arr.length-1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>target){
                e=mid-1;
            }
            else if (arr[mid]<target){
                s=mid+1;
            }
            else return mid;
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 12, 15};
        System.out.println(minDiffele(arr,8));
    }

}
