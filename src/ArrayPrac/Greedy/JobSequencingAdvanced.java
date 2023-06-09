package ArrayPrac.Greedy;

import java.util.Arrays;

class JobAdv{
     int id;
     int deadline;
     int profit;

    public JobAdv(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "JobAdv{" +
                "id=" + id +
                ", deadline=" + deadline +
                ", profit=" + profit +
                '}';
    }
}
public class JobSequencingAdvanced {
    static int maxProfit(JobAdv[] arr){
       JobAdv[] profits = new JobAdv[Arrays.stream(arr).reduce((a,b)->a.deadline>b.deadline?a:b).get().deadline];
     //   System.out.println(Arrays.toString(profits));
      Arrays.sort(arr,(a,b)->b.profit-a.profit);
      //  System.out.println(Arrays.toString(arr));
      int profit =0;
        for (int i = 0; i < arr.length; i++) {
            int dl= arr[i].deadline-1;
      //      System.out.println(dl);
            if(profits[dl]==null){
                profits[dl] = arr[i];
            }
            else{
                int j=dl-1;
                while(j>=0){
                    if(profits[j]==null){
                        profits[j] = arr[i];
                        break;
                    }
                    j--;
                }
            }
        }
     //   System.out.println(Arrays.toString(profits));
        for (int i = 0; i < profits.length; i++) {
            if(profits[i]!=null)
            profit+=profits[i].profit;
        }
        return profit;


    }

    public static void main(String[] args) {
        JobAdv j1 = new JobAdv(1,4,20);
        JobAdv j2 = new JobAdv(2,5,60);
        JobAdv j3 = new JobAdv(3,6,70);
        JobAdv j4 = new JobAdv(4,6,65);
        JobAdv j5 = new JobAdv(5,4,25);
        JobAdv j6 = new JobAdv(6,2,80);
        JobAdv j7 = new JobAdv(7,2,10);
        JobAdv j8 = new JobAdv(8,2,22);

        JobAdv[] arr = {j1,j2,j3,j4,j5,j6,j7,j8};
        System.out.println(maxProfit(arr));


    }
}
