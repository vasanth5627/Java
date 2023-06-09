package ArrayPrac.Searching;

public class MountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                if(arr[mid]>arr[mid-1]){
                    return mid;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                start = mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr  = {0,1,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
