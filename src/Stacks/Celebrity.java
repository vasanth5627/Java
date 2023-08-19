package Stacks;

import java.util.Stack;

public class Celebrity {
    static int celebrity(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean vt = vertical(arr,i);
            boolean hz = horizontal(arr,i);
            if(vt && hz) return i;
        }
        return -1;
    }

    private static boolean horizontal(int[][] arr, int i) {
        for (int j = 0; j < arr.length; j++) {
            if(j!=i && arr[i][j]==1) return false;
        }
        return true;
    }

    private static boolean vertical(int[][] arr, int i) {
        for (int j = 0; j < arr.length; j++) {
            if(j!=i && arr[j][i]==0) return false;
        }
        return true;
    }

    static int celebrityAdv(int[][] arr){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }

        while(st.size()!=1){
            int f = st.pop();
            int s = st.pop();
            if(arr[f][s]==0){
                st.push(f);
            }
            else{
                st.push(s);
            }
        }
        int s = st.pop();
        if(vertical(arr,s) && horizontal(arr,s)){
            return s;
        }
        return -1;
    }

    static int celebrityAdv1(int[][] arr){
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[c][i]==1){
               c=i;
            }

        }
        for (int i = 0; i <arr.length; i++) {
            if(i!=c && (arr[c][i]==1 || arr[i][c] ==0)) return -1;
        }
        return c;
    }



    public static void main(String[] args) {
        int[][] arr = {{0,1,0},{0,0,0},{0,1,0}};
        System.out.println(celebrityAdv1(arr));
    }
}
