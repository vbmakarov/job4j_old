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
        int indexH=0, indexG=0;
        boolean init=false;
        for (int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                if (board[i][j]=='X') {
                    indexH=j;
                    indexG=i;
                    init=true;
                    break;
                }
            }
            if(init){
                break;
            }
        }
        if(monoHorizontal(board, indexG) || monoVertical(board, indexH)){
            result=true;
        }

        return result;
    }
    public static boolean monoVertical(char[][] board, int index){
        boolean result=false;
        for(int i=0;i<board.length;i++){
            if(board[i][index]=='X'){
                result=true;
            }
            else{
                result=false;
                break;
            }
        }
        return result;
    }

    public static boolean monoHorizontal(char[][] board, int index){
        boolean result=false;
        for(int i=0;i<board.length;i++){
            if(board[index][i]=='X'){
                result=true;
            }
            else{
                result=false;
                break;
            }
        }
        return result;
    }

}