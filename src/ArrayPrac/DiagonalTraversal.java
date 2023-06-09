package ArrayPrac;

public class DiagonalTraversal {
    static void upperDiagonalTraversal(int[][] arr){

        for (int i = 0; i < arr[0].length; i++) {
            int j=0;
            int k=i;
            while(k<arr.length){
                System.out.print(arr[j][k]+" ");
                j++;
                k++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{5,6,7},{9,10,11},{13,14,15}};
        upperDiagonalTraversal(arr);
    }
}
