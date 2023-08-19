package Recurssion;

public class FloodFill {
    static void floodFill(int[][] arr, int sr, int sc,String psf,boolean[][] visited){
        //base-cases
        if(sr<0 || sc<0 || sr==arr.length || sc==arr[0].length || arr[sr][sc]==1|| visited[sr][sc]==true){
            return;
        }
        //sol
        if(sr==arr.length-1 && sc == arr[0].length-1){
            System.out.println(psf);
            return;
        }
        //mark the box as visited
        visited[sr][sc] = true;
        //traversal
        floodFill(arr,sr-1,sc,psf+"t",visited); //top
        floodFill(arr,sr,sc-1,psf+"l",visited); //left
        floodFill(arr,sr+1,sc,psf+"d",visited); //down
        floodFill(arr,sr,sc+1,psf+"r",visited); //right
        //unMark it to make it available for next exploration
        visited[sr][sc] = false;
    }

    public static void main(String[] args) {
        int[][] arr = {{0,1,0,0,0,0,0},{0,1,0,1,1,1,0},{0,0,0,0,0,0,0},{1,0,1,1,0,1,1},
                {1,0,1,1,0,1,1},{1,0,0,0,0,0,0}};
        floodFill(arr,0,0,"",new boolean[arr.length][arr[0].length]);
    }
}
