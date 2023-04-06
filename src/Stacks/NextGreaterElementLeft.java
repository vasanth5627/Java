package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementLeft {
    static int[] nextGreaterElementLeft(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        res[0]=-1;
        st.push(0);
        for(int i=1;i<arr.length;i++){
            if(st.size()>0 && arr[st.peek()]>=arr[i]){

                res[i]=st.peek();
            }
            else{
                while(st.size()>0 && arr[st.peek()]<arr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    res[i]=-1;
                }
                else if(st.size()>0){
                    res[i]=st.peek();
                }
            }
            st.push(i);
        }
        return res;
    }

    static int[] stockSpan(int[] arr){
        int[] ngel = nextGreaterElementLeft(arr);
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(ngel[i]==-1){
                res[i]=i+1;
            }
            else{
                res[i]=i-ngel[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={2,5,9,3,1,12,6,8,7};
        System.out.println(Arrays.toString(nextGreaterElementLeft(arr)));
        System.out.println(Arrays.toString(stockSpan(arr)));

    }
}
