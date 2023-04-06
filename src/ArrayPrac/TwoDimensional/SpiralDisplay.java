package ArrayPrac.TwoDimensional;

public class SpiralDisplay {
    static void spiralDisplay(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int te = m*n;
        int count=0;
        int minc = 0;
        int maxc = arr[0].length-1;
        int minr = 0;
        int maxr = arr.length-1;

        while(te>count){


            //left wall
            for (int i = minr; i <=maxr; i++) {
                System.out.print(arr[i][minr]+" ");
                count++;
            }
            System.out.println();
            minr++;



            //bottom wall

            for (int i = minc; i <=maxc; i++) {
                System.out.print(arr[maxr][i]+" ");
                count++;
            }
            System.out.println();
            minc++;



            //right wall

            for (int i = maxr; i>=minr; i--) {
                System.out.print(arr[i][maxr]+" ");
                count++;
            }
            System.out.println();
            maxr--;


            //top wall

            for (int i = maxc; i>=minc; i--) {
                System.out.print(arr[minc][i]+" ");
                count++;
            }

            maxc--;



        }

    }
    public static void main(String[] args) {
        int[][] arr = {{10,11,12,13},{23,44,56,12},{12,16,19,17},{10,34,56,11}};
        spiralDisplay(arr);
    }
}
