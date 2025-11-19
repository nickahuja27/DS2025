package com.learning.ds.backtracking.verma;

import java.util.Arrays;

public class P18_NQueens {
    public static void main(String[] args) {
        char[][] board = new char[4][4];
        for(int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], '.');
        }
        placeQueens(board, 0);
        print(board);
    }

    private static boolean placeQueens(char[][] board, int column) {
        if(column == board.length) {
            System.out.println("Placed");
            return true;
        }

        for(int row = 0; row < board.length; row++) {
            if(isValid(board, row, column)) {
                board[row][column] = 'Q';
                boolean queenPlaced =  placeQueens(board, column + 1);
                if(queenPlaced)
                    return true;
                board[row][column] = '.';
            }
        }

        return false;
    }

    private static boolean isValid(char[][] board, int row, int col) {
        //Check for horizontal line
        for(int i = 0; i < col; i++) {
            if(board[row][i] == 'Q')
                return false;
        }
        //Check for diagonal left-> right till the current row/col. Others we have not worked on yet
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q')
                return false;
        }

        //Check on diagonal right <- left from ro/col till we reach the boundary.
        // Others we have not worked on yet
        for(int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if(board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    private static void print(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }
}
