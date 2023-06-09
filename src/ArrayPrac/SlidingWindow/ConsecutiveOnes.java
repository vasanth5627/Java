package ArrayPrac.SlidingWindow;

import ArrayPrac.Interview;

public class ConsecutiveOnes {
    static int consecutiveOnes(int[] arr){
        int maxOnes = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            boolean flipped = false;
            int j=i;
            while(j<arr.length){
                if(arr[j]==1) j++;
                else{
                    if(!flipped){
                        flipped = true;
                        j++;
                    }
                    else{
                        maxOnes = Math.max(maxOnes,(j-i));
                        break;
                    }
                }
            }
            maxOnes = Math.max(maxOnes,(j-i));

        }
        return maxOnes;
    }

    static int consecutiveOnes2(int[] arr, int k){
        int maxCount = Integer.MIN_VALUE;
        int i=0;
        int j=0;
        int count=0;
        while(i<arr.length && j< arr.length){
            if(arr[j]==1){
                j++;
            }
            else{
                if(count<k){
                    count++;
                    j++;
                }
                else{
                    maxCount = Math.max(maxCount,j-i);
                    count--;
                    while(arr[i]!=0 && i<arr.length){
                        i++;
                    }
                    i++;

                }
            }
        }
        return Math.max(maxCount,j-i);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,0,0,1,1,0,1,0,1,1};
      //  System.out.println(consecutiveOnes(arr));
        System.out.println(consecutiveOnes2(arr,2));
    }
}
