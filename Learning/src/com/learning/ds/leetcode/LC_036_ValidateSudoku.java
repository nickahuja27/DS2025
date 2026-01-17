package com.learning.ds.leetcode;

public class LC_036_ValidateSudoku {
    public static void main(String[] args) {
        String[][] board = {{"5","3",".",".","7",".",".",".","."},
                            {"6",".",".","1","9","5",".",".","."},
                            {".","9","8",".",".",".",".","6","."},
                            {"8",".",".",".","6",".",".",".","3"},
                            {"4",".",".","8",".","3",".",".","1"},
                            {"7",".",".",".","2",".",".",".","6"},
                            {".","6",".",".",".",".","2","8","."},
                            {".",".",".","4","1","9",".",".","5"},
                            {".",".",".",".","8",".",".","7","9"}};

        boolean isValid = validate(board);
        System.out.println(isValid);
    }

    private static boolean validate(String[][] board) {
        // validate rows...
        for(int i = 0; i < board.length; i++) {
            boolean[] flags = new boolean[board.length];
            for(int j = 0; j < board.length; j++) {
                if (!board[i][j].equals(".")) {
                    int value = Integer.parseInt(board[i][j]);
                    if (flags[value - 1] == true) {
                        return false;
                    } else {
                        flags[value - 1] = true;
                    }
                }
            }
        }

        // validate columns...

        for(int i = 0; i < board.length; i++) {
            boolean[] flags = new boolean[board.length];
            for(int j = 0; j < board.length;j++) {
                if (!board[j][i].equals(".")) {
                    int value = Integer.parseInt(board[j][i]);
                    if (flags[value - 1] == true) {
                        return false;
                    } else {
                        flags[value - 1] = true;
                    }
                }
            }
        }

        for(int block = 0; block < 9; block++) {
            boolean[] flags = new boolean[9];
            for(int i = block/3*3; i < block/3*3 + 3; i++) {
                for(int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                    if (!board[i][j].equals(".")) {
                        int value = Integer.parseInt(board[i][j]);
                        if (flags[value - 1] == true) {
                            return false;
                        } else {
                            flags[value - 1] = true;
                        }
                    }
                }
            }
        }

        return true;
    }
}
