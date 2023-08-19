package Stacks;

import java.util.Arrays;

public class NthStackAdv {
    private int[] arr;
    private int[] top;
    private int[] next;
    private int free;

   public NthStackAdv(int S,int N){
       arr = new int[S];
       top = new int[N];
       next = new int[S];
       free = 0;
       Arrays.fill(top,-1);
       for (int i = 0; i < next.length; i++) {
           next[i] = i+1;
       }
       next[S-1] = -1;
   }

   public boolean push(int x, int n){
       if(free==-1) return false;
       int idx = free;
       free = next[idx];
       arr[idx] = x;
       next[idx] = top[n-1];
       top[n-1] = idx;
       return true;
   }

   public int pop(int n){
       if(top[n-1]==-1) return -1;
       int idx = top[n-1];
       top[n-1] = next[idx];
       next[idx] = free;
       free = idx;
       return arr[idx];

   }

    public static void main(String[] args) {

    }
}
