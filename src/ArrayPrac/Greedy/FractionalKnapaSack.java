package ArrayPrac.Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FractionalKnapaSack {
    static int fractionalKnapSack(int[] weight, int[] values, int N){
        double[][] ratio = new double[weight.length][2];
        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i; //index
            ratio[i][1] = values[i]/weight[i];  // we want more value and less weight
        }
        //ratio should be in descending order as we go for max profit
        Arrays.sort(ratio, (a,b)-> (int) (b[1]-a[1]));
//      Arrays.stream(ratio).forEach(e-> System.out.println(Arrays.toString(e)));
        int ans = 0;
        int capacity =N;
        for(int i=0;i<ratio.length;i++){
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]){ //inclide full item
                ans+=values[idx];
                capacity-= weight[idx];


            }
            else{
                //include partial item
                ans+=(ratio[i][1]*capacity);
                capacity=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] weight = {10,20,30};
        int[] value = {60,100,120};
        System.out.println(fractionalKnapSack(weight,value,50));


    }
}
