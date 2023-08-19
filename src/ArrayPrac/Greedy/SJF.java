package ArrayPrac.Greedy;

import java.util.PriorityQueue;

public class SJF {
    static class Process_{

        int id;
        int burstTime;
        int arrivalTime;

        public Process_(int id, int burstTime, int arrivalTime) {
            this.id = id;
            this.burstTime = burstTime;
            this.arrivalTime = arrivalTime;
        }

        @Override
        public String toString() {
            return "process{" +
                    "id=" + id +
                    ", burstTime=" + burstTime +
                    ", arrivalTime=" + arrivalTime +
                    '}';
        }
    }
    static void sjf(Process_[] arr){
        int t=0;
        int k = arr.length;
        PriorityQueue<Process_> pq = new PriorityQueue<>((a,b)->a.burstTime-b.burstTime);
        int tat=0;
        int wt=0;
        while(k>0){
            addProcess(arr,pq,t);
            System.out.println(pq);
            if(pq.size()>0){
                Process_ curr = pq.poll();
                System.out.println(curr+" curr");
                t=t+curr.burstTime;
                tat+=t-curr.arrivalTime;
                System.out.println(tat+" "+ curr.id);
                wt+=tat- curr.burstTime;
                System.out.println(wt+" "+curr.id);
                k--;
            }
            else{
                t++;
            }

        }
        System.out.println("Average timings");
        System.out.println(tat+" "+wt);
        System.out.println(tat/arr.length+" "+wt/arr.length);


    }

    private static void addProcess(Process_[] arr,PriorityQueue<Process_> pq, int t) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null && arr[i].arrivalTime<=t){
                if(!pq.contains(arr[i])){
                    pq.add(arr[i]);
                    arr[i] = null;
                }

            }
        }
    }

    public static void main(String[] args) {
        Process_ proc[] = { new Process_(1, 6, 1),
                new Process_(2, 8, 1),
                new Process_(3, 7, 2),
                new Process_(4, 3, 3)};

        sjf(proc);
    }
}
