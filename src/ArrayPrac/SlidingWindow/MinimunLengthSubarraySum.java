package ArrayPrac.SlidingWindow;

public class MinimunLengthSubarraySum {
    static int minLenSubArraySum(int[] arr, int k){
       int minlen = Integer.MAX_VALUE;
       int i=0;
       int j=0;
       int sum=0;
       while(i<arr.length){
           while(sum<k && j<arr.length){
               sum+=arr[j];
               j++;
           }
           if(sum>=k)
           minlen = Math.min(minlen,j-i);
           sum-=arr[i];
           i++;


       }


        return minlen;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,10,10,8,10};


        System.out.println(minLenSubArraySum(arr,10));

    }
}
