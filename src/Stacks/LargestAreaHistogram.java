package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class LargestAreaHistogram {
    static int[] nextSmallerElementRight(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        res[arr.length-1]=arr.length;
        for(int i=arr.length-2;i>=0;i--){
            if(st.size()>0 && arr[st.peek()]<arr[i]){
                res[i]=st.peek();
            }
            else{
                while(st.size()>0 && arr[st.peek()]>=arr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    res[i]=arr.length;
                }
                else{
                    res[i]=st.peek();
                }
            }
            st.push(i);
        }
        return res;
    }

    static int[] nextSmallerElementLeft(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        res[0]=-1;
        for(int i=1;i<arr.length;i++){
            if(st.size()>0 && arr[st.peek()]<arr[i]){
                res[i]=st.peek();
            }
            else{
                while(st.size()>0 && arr[st.peek()]>=arr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    res[i]=-1;
                }
                else{
                    res[i]=st.peek();
                }
            }
            st.push(i);
        }
        return res;
    }
    static int largestAreaHistogram(int[] arr){
        int[] right = nextSmallerElementRight(arr);
        int[] left = nextSmallerElementLeft(arr);
        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int area = ((right[i]-left[i])-1)*arr[i];
            maxArea= Math.max(area,maxArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {6,2,5,4,5,1,6};
        System.out.println(Arrays.toString(nextSmallerElementRight(arr)));
        System.out.println(Arrays.toString(nextSmallerElementLeft(arr)));
        System.out.println(largestAreaHistogram(arr));
    }
}
