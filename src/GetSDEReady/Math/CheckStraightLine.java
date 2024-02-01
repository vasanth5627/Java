package GetSDEReady.Math;

import java.util.Arrays;

public class CheckStraightLine {
    public static boolean slope(int[][] arr){
        System.out.println(arr.length);
        int x1 = arr[0][0];
        int y1 = arr[0][1];
        int x2 = arr[1][0];
        int y2 = arr[1][1];
        int x3 = arr[2][0];
        int y3 = arr[2][1];
        System.out.println(x1+" "+x2+" "+x3+" "+y1+" "+y2+" "+y3);
       return (y2-y1)*(x3-x2)==(y3-y2)*(x2-x1);
    }

    public static boolean checkStraightLine(int[][] arr){
        if(arr.length<2) return true;
        for (int i=0;i<arr.length-2;i++){
            if(!slope(Arrays.copyOfRange(arr,i,i+3)))
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3},{3,5}};
     //   System.out.println(Arrays.toString(rrays.copyOfRange(arr,0,2)));
        System.out.println(checkStraightLine(arr));

    }
}
