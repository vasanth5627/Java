package ArrayPrac.Searching;

public class SearchInRotatedSortedArray {
    static int pivot(int[] arr){
        if(arr.length==1) return 0;
        if(arr[arr.length-1]>arr[0]) return arr.length-1;
        int s =0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(e>mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(s>0 && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[s]>arr[mid]){
                e = mid;
            }
            else{
                s = mid;
            }
        }
        return -1;
    }

    static int rotatedSearchDuplicates(int[] arr, int target){
        if(arr[arr.length-1]>arr[0]) return arr.length-1;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target) return mid;
            //if left array is sorted
            if(arr[mid]>arr[s]){
                if(arr[mid]>target && target>=arr[s]){
                    e=mid;
                }
                else{
                    s=mid+1;
                }
                
            }
            //right array sorted
            else if(arr[mid]<arr[s]){
                if(arr[mid]<target && target<arr[s]){
                    s=mid+1;
                }
                else{
                    e=mid;
                }
            }
            else{
                s++;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

    }
}
