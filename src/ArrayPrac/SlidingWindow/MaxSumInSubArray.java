package ArrayPrac.SlidingWindow;

public class MaxSumInSubArray {
    static void subArrayofSizeK(int[] arr, int t){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(i+t<=arr.length) {
                int sum=0;
                for (int j = i; j < i + t; j++) {
                   sum+=arr[j];

                }
                if(sum>maxSum) maxSum= sum;
            }

        }
        System.out.println(maxSum);
    }

    static int maxSumofSubArrayofSizeK(int[] arr, int k){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i <k; i++) {
            sum += arr[i];
        }
        if(sum>maxSum) maxSum = sum;

        for(int i=k;i<=arr.length-k+1;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            if(sum>maxSum) maxSum = sum;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        subArrayofSizeK(arr,3);
        System.out.println(maxSumofSubArrayofSizeK(arr,3));
    }
}
