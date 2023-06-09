package ArrayPrac;

public class SaddlePoint {
    static int saddlePoint(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int j = minr(arr[i]);
            if(isMax(arr,arr[i][j],j)){
                return arr[i][j];
            }

        }
        return -1;
    }

     static boolean isMax(int[][] arr, int val, int i) {
        boolean max = true;
        for(int j=0;j<arr.length;j++){
            if(arr[j][i]>val){
                return false;
            }
        }
        return max;
    }

    static int minr(int[] arr) {
        int min = 0;
         for (int i = 1; i < arr.length; i++) {
             if(arr[i]<arr[min]){
                 min=i;
             }
         }
         return min;
    }

    public static void main(String[] args) {
        int[][] arr = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        System.out.println(saddlePoint(arr));
    }
}
