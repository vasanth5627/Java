package ArrayPrac;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiral(int[][]arr){
        List<Integer> al = new ArrayList<>();
        int minc = 0;
        int minr = 0;
        int maxc = arr[0].length-1;
        int maxr = arr.length-1;
        int c=0;
        int te= (maxc+1)*(maxr+1);

        while(c<te){
            //tw
            for(int i = minc, j = minr; i<=maxc && c<te;i++){
                al.add(arr[j][i]);
                c++;
            }
            minr++;

            //rw
            for(int i = minr, j = maxc; i<=maxr && c<te;i++){
                al.add(arr[i][j]);
                c++;
            }
            maxc--;

            //bw
            for(int i = maxc, j = maxr; i>=minc && c<te;i--){
                al.add(arr[j][i]);
                c++;
            }
            maxr--;

            //lw
            for(int i = maxr, j = minc; i>=minr && c<te;i--){
                al.add(arr[i][j]);
                c++;
            }

            minc++;
        }

        return al;

    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiral(arr));
    }
}
