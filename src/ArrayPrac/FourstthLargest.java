package ArrayPrac;

import java.util.PriorityQueue;

public class FourstthLargest {
    static int fourthLargest(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue();
        int ans =-1;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>4){
                pq.poll();
            }
        }
        return pq.poll();
    }
    public static void main(String[] args) {
        int[] arr = {10,1,2,3,12};
        System.out.println(fourthLargest(arr));
    }
}
