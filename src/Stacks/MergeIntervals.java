package Stacks;

import java.util.Arrays;
import java.util.Stack;

 class Pair implements Comparable<Pair>{
    int start;
    int end;

     public Pair(int start, int end) {
         this.start = start;
         this.end = end;
     }
    public String toString(){
        return this.start+" "+this.end;
     }

     @Override
     //this(start)>other return +ve
     //this==other return 0
     //else return negative
     public int compareTo(Pair other) {
         if(this.start != other.start)
            return this.start- other.start;
         return 0;
     }
 }

public class MergeIntervals {
    static void mergeIntervals(int[][] arr){
        Pair[] pairs = new Pair[arr.length];
        for(int i=0;i<arr.length;i++){
            pairs[i] = new Pair(arr[i][0],arr[i][1]);
        }
        Arrays.sort(pairs);
        for(int i=0;i<pairs.length;i++){
            System.out.println(pairs[i].toString());
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        Stack<Pair>st= new Stack();
        st.push(new Pair(arr[0][0],arr[0][1]));
        for(int i=1;i<arr.length;i++){
            Pair temp = st.peek();
            if(arr[i][0]<=temp.end){
                temp.end = arr[i][1]>temp.end?arr[i][1]:temp.end;

            }
            else{
                st.push(new Pair(arr[i][0],arr[i][1]));
            }

        }
        for (Pair i:
             st) {
            System.out.println(i.toString());

        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3},{8,10},{6,9},{2,5},{11,15},{12,19}};
        mergeIntervals(arr);
    }
}
