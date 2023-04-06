package ArrayPrac.TwoDimensional;

import java.util.Arrays;

public class MatrixMul {
    static int[][] matrixMul(int[][] arr,int[][] brr){
        System.out.println(brr.length);
        int[][] res = new int[arr.length][brr[0].length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                for (int k = 0; k < arr[0].length; k++) {
                    res[i][j]+=arr[i][k]*brr[k][j];
                }

            }


        }
        return res;
    }
    public static void main(String[] args) {
        int[][] arr = {{10,20,30},{5,15,40},{60,50,30}};
        int[][] brr=  {{5,10,15,20},{1,0,10,5},{5,50,10,40}};
        int[][] res = matrixMul(arr,brr);
        for(int[] i : res){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
