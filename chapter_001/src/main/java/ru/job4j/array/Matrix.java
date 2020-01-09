package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
               table[i][j]=(i+1)*(j+1);
            }
        }
        return table;
    }


    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i=0;i<board.length;i++) {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    result=true;
                    break;
                }
        }

        return result;
    }
    public static boolean monoVertical(char[][] board, int index){
        boolean result=true;
        for(int i=0;i<board.length;i++){
            if (board[i][index] == 'X') {
                continue;
            }
            result=false;
        }
        return result;
    }

    public static boolean monoHorizontal(char[][] board, int index){
        boolean result=true;
        for(int i=0;i<board.length;i++){
            if (board[index][i] == 'X') {
                continue;
            }
            result=false;
        }
        return result;
    }

}