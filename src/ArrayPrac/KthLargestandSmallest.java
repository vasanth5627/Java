package ArrayPrac;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestandSmallest {
    static int kthlargest(int[] arr, int k){
       int max = Integer.MIN_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
       for(int i:arr){
           pq.add(i);
           if(pq.size()>k){
               System.out.print(pq+" ");
               int r= pq.poll();
               System.out.println(r+" ");
           }
       }
       max = pq.poll();
       return max;
    }

    static int kthsmallest(int[] arr, int k){
        int min = Integer.MIN_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: arr){
            pq.add(i);
        }
        System.out.println(pq);
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        System.out.println(pq);
        min = pq.poll();
        return min;
    }

    public static int kthsmallestadv(int[] arr , int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//max-heap
        for (int i:arr) {
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }

        }
        return pq.poll();
    }
    public static void main(String[] args) {
        int[] arr = {1,7,8,3,2,5,6};
        int lar = kthlargest(arr,3);
        System.out.println(lar);

        int min = kthsmallest(arr,3);
        System.out.println(min);

        System.out.println(kthsmallestadv(arr,3));

    }
}
