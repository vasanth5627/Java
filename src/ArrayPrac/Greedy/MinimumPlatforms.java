package ArrayPrac.Greedy;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumPlatforms {
    static int maxPlatforms(int[] arr,int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=1;
        int maxPlatforms = 1;
        while(i<arr.length && j<arr.length){
            if(dep[i]>=arr[j]){
                maxPlatforms = Math.max(maxPlatforms,(j-i)+1);
                j++;
            }
            else{
                i++;
            }

        }
        return maxPlatforms;
    }
   static class Departures{
        int dept;
        int count;

        Departures(int dept, int count){
            this.dept = dept;
            this.count = count;
        }

       @Override
       public String toString() {
           return "Departures{" +
                   "dept=" + dept +
                   ", count=" + count +
                   '}';
       }
   }
    static int maxPlatformsPq(int[] arr,int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        PriorityQueue<Departures> pq = new PriorityQueue<>((a,b)->a.dept-b.dept);
        int i=0;
        int count=1;
        int maxCount= 1;
        pq.add(new Departures(dep[i],count));
        i++;
        while(i<arr.length){
            if(arr[i]<=pq.peek().dept){
                pq.add(new Departures(dep[i],++count));
                maxCount = Math.max(count,pq.size());
            }
            else{
                pq.poll();
                count--;
                pq.add(new Departures(dep[i],count));
            }
            i++;
        }
        return maxCount;

    }


    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(maxPlatforms(arr,dep));
        System.out.println(maxPlatformsPq(arr,dep));
    }
}
