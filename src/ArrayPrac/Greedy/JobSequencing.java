package ArrayPrac.Greedy;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Job{
    int deadline;
    int value;

    public Job(int deadline, int value) {
        this.deadline = deadline;
        this.value = value;
    }

    public int getDeadline() {
        return deadline;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Job{" +
                "deadline=" + deadline +
                ", value=" + value +
                '}';
    }


    
}
public class JobSequencing {
    static int jobSequencing(int[] deadlines, int[] values){
        Job[] jobs  = new Job[values.length];
        for (int i = 0; i < values.length; i++) {
           jobs[i] = new Job(deadlines[i],values[i]);

        }
         Arrays.sort(jobs,(a,b)->b.value-a.value);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        System.out.println(Arrays.toString(jobs));
        int time = 0;
        int tval = 0;
        for (int i = 0; i < jobs.length; i++) {
            if(jobs[i].deadline>time){
                time++;
                tval+=jobs[i].value;
            }
        }
        return tval;

    }
    public static void main(String[] args) {
        int[] deadlines = {4,1,1,1};
        int[] values = {20,10,40,30};
        System.out.println(jobSequencing(deadlines,values));
    }
}
