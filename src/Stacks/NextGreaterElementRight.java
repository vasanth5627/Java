package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementRight {
    static int[] nextGreaterElementRight(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res= new int[arr.length];
        res[arr.length-1]=-1;
        st.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            if(st.size()>0 && st.peek()>=arr[i]){
                res[i]=st.peek();

            }
            else{
                while(st.size()>0 && st.peek()<arr[i]){
                    st.pop();
                }
            }
            if(st.size()==0) res[i]=-1;
            if(st.size()>0) res[i]=st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
//        int[] arr = {2,5,9,3,1,12,6,8,7};
        int[] arr ={5,3,8,-2,7};
        System.out.println(Arrays.toString(nextGreaterElementRight(arr)));

    }
}
