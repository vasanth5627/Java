package SmallProjects.TicTacToe;

import java.util.Arrays;

public class TicTacToe {
    Mark[][] board;

    public TicTacToe() {
        board = new Mark[3][3];
        init();
    }

    void init(){
        Arrays.stream(board).forEach(e->Arrays.fill(e,Mark.E));
    }

    void placeMark(int row,int col,Mark mark){
        if(row>=0 && col>=0 && row<4 && col<4) {
            if(board[row][col]==Mark.E)
            board[row][col] = mark;
            else{
                System.err.println("The position is already marked");
            }
        }
        else
        System.err.println("Enter a Valid position");
    }

    void display(){
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    
    boolean checkWinner(Mark[][] board,int row,int col,Mark mark){
        return false;
        
    }
    
    boolean checkVertical(Mark[][] board,int col){
        for (int i = 1; i < board[0].length; i++) {
            if(board[i-1][col]!=board[i][col]) return false;
        }
        return true;
    }
    
    boolean checkHorizontal(Mark[][] board,int row){
        for (int i = 1; i < board.length; i++) {
            if(board[row][i-1]!=board[row][i]) return false;
        }
        return true;
    }
    
    boolean checkDiagonal(Mark[][] board,int row,int col){
//        for (int i = 0; i < ; i++) {
//
//        }
        return false;
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.display();
        ticTacToe.placeMark(0,0,Mark.X);
        ticTacToe.placeMark(0,1,Mark.Y);
        ticTacToe.display();
    }
}
