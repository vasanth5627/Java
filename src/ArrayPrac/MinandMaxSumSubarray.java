package ArrayPrac;

public class MinandMaxSumSubarray {
    static int maxSumSubArray(int[] arr, int k){
        int maxSum = Integer.MIN_VALUE;
        int csum=0;
        for(int i=0;i<k;i++){
            csum+=arr[i];
        }

        maxSum = Math.max(csum,maxSum);

        for(int i=k;i<arr.length;i++){
            csum+=arr[i]-arr[i-k];
            maxSum = Math.max(csum,maxSum);
        }
        return maxSum;
    }

    static int minSumSubArray(int[] arr, int k){
        int minSum = Integer.MAX_VALUE;
        int csum=0;
        for(int i=0;i<k;i++){
            csum+=arr[i];
        }

        minSum = Math.min(csum,minSum);

        for(int i=k;i<arr.length;i++){
            csum+=arr[i]-arr[i-k];
            minSum = Math.min(csum,minSum);
        }
        return minSum;
    }


    public static void main(String[] args) {
        int[] arr = {100,200,300,400};
        System.out.println(maxSumSubArray(arr,2));
        System.out.println(minSumSubArray(arr,2));
    }
}
