package ArrayPrac.Searching;



public class FindInMountainArray {
    static int findInMountainArray(int[]arr,int target){
        int x = findPivot(arr);
        System.out.println(x+" "+arr[x]);
        if(target==arr[x]) return x;
        if(target>arr[x]){
            return -1;
        }
        else if(target<arr[x]){
            int res = binarySearch(arr,0,x-1,target);
            if(res==-1){
                res = orderAgnosticBinarySearch(arr,x+1,arr.length-1,target);
            }
            return res;

            }




        return -1;
        }





    private static int binarySearch(int[] arr, int s, int e,int target) {
        int idx=-1;
        System.out.println(s+" s: e "+e);
        while(s<=e){
            int mid = s+(e-s)/2;
            System.out.println(mid+" "+mid);
            if(arr[mid]>target){
                e=mid-1;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                idx= mid;
                e=mid-1;
            }
        }
        return idx;
    }

    public static int orderAgnosticBinarySearch(int[] arr, int s, int e, int target){
        int idx=-1;
        System.out.println(s+" s: e "+e);
        while(s<=e){
            int mid = s+(e-s)/2;
            System.out.println(mid+" "+arr[mid]);
            if(arr[mid]>target){
                s=mid+1;
            }
            else if(arr[mid]<target){
                e=mid-1;
            }
            else{
                idx= mid;
                s=mid+1;
            }
        }
        return idx;
    }

    static int findPivot(int[]arr){
        int s =0;
        int e = arr.length-1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>arr[mid+1]){
                if(arr[mid]>arr[mid-1]){
                    return mid;
                }
                else{
                    e=mid-1;
                }
            }
            else{
                s=mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int[] arr1 = {1,2,3,2,1};
       //System.out.println(orderAgnosticBinarySearch(arr1,0,arr1.length-1,2));
       System.out.println(findInMountainArray(arr,3));

    }
}
