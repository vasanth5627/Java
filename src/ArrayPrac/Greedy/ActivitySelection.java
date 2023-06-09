package ArrayPrac.Greedy;

import OOPS.AbstractDemo.Parent;
import OOPS.InterfaceDemo.ExtendsDemo.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

  class Pair{
    int start;
    int end;

    public Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }


      @Override
      public String toString() {
          return "Pair{" +
                  "start=" + start +
                  ", end=" + end +
                  '}';
      }
  }
public class ActivitySelection {

    static int activitySelection(int[] arr, int[] brr){
        List<Pair> al = new ArrayList<>();
        Pair[] ans = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
           al.add(new Pair(arr[i],brr[i]));
           ans[i] = new Pair(arr[i],brr[i]);
        }
        al.sort((a,b)->a.end-b.end);
        Arrays.sort(ans, (a,b)->a.end-b.end);
//        System.out.println("List");
//        al.stream().forEach(e-> System.out.println(e));
//        System.out.println("Array");
//        Arrays.stream(ans).forEach(e-> System.out.println(e));
        int sol = 1;
        int k = 0;
        for (int i = 1; i < ans.length; i++) {

            if(ans[k].end<=ans[i].start){
                sol++;
                k++;
//                System.out.println(ans[i-1]+" "+ans[i]);
            }
        }
        return sol;

    }
    public static void main(String[] args) {
        int[] arr = {3,0,1,5,8,5};
        int[] brr = {4,6,2,7,9,9};
        int sol =  activitySelection(arr,brr);
        System.out.println(sol);
    }
}
