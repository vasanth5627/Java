package Graphs.Problems;

public class NumberOfIslands {
    public static int countIslands(int[][] arr){
        int count = 0;
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==1 && visited[i][j]==false){
                    drawTree(arr,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }

    private static void drawTree(int[][] arr, int i, int j, boolean[][] visited) {
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || visited[i][j]==true || arr[i][j]==0){
            return;
        }
        visited[i][j] = true;
        drawTree(arr,i+1,j,visited);
        drawTree(arr,i-1,j,visited);
        drawTree(arr,i,j+1,visited);
        drawTree(arr,i,j-1,visited);
        drawTree(arr,i-1,j+1,visited);
        drawTree(arr,i+1,j+1,visited);
        drawTree(arr,i+1,j-1,visited);
        drawTree(arr,i-1,j-1,visited);
    }

    public static void main(String[] args) {
        int[][] arr = {{0,1},{1,0},{1,1},{1,0}};
        System.out.println(countIslands(arr));
    }
}
