package ArrayPrac.Greedy;

import java.util.Arrays;

public class ChocoProblem {
    static int minCost(int[] vertical, int[] horizontal){
        Arrays.sort(vertical);
        Arrays.sort(horizontal);
        reverse(vertical);
        reverse(horizontal);
        int hp = 1; int vp = 1; int cost = 0; int v =0; int h = 0;
        while(h<horizontal.length && v<vertical.length){
            if(horizontal[h]>=vertical[v]){
                cost+= horizontal[h]*vp;
                hp++;
                h++;
            }
            else{
                cost+= vertical[v]*hp;
                vp++;
                v++;
            }
        }
        while(h<horizontal.length){
            cost+= horizontal[h]*vp;
            hp++;
            h++;
        }
        while(v<vertical.length){
            cost+= vertical[v]*hp;
            vp++;
            v++;
        }
        return cost;

    }
    static void reverse(int[] arr){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] vertical = {2,1,3,1,4};
        int[] horizontal = {4,1,2};
        System.out.println(minCost(vertical,horizontal));
    }
}
