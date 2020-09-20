package LeetCOde;

import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    编写一个程序，通过已填充的空格来解决数独问题。

一个数独的解法需遵循如下规则：

数字 1-9 在每一行只能出现一次。
数字 1-9 在每一列只能出现一次。
数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
空白格用 '.' 表示。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/sudoku-solver
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode37 {
    private static boolean [] [] rowboolean  =new boolean[9][9];
    private static boolean [] [] colboolean =new boolean[9][9] ;
    private static boolean [] [] [] san =new boolean[3][3][9] ;
    private static List<int[]> list = new ArrayList<>();
    static  boolean success =false;
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        solveSudoku(board);


    }

    public static void solveSudoku(char[][] board) {
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if (board[i][j] !='.'){
                    //数字1~9，储存0~8

                    int num = board[i][j] - '0' - 1;
                    rowboolean[i][num] = colboolean[j][num] = san[i/3][j/3][num] = true;
                }
                else {
                    list.add(new int[]{i,j});
                }

            }

        }

        track(board,0);




    }

    private static void track(char[][] board, int i) {
        if (i == list.size()){
            success =true;
            return ;
        }

        int row =list.get(i)[0];
        int col =list.get(i)[1];
        for (int j =1; j<=9&&success==false;j++){
            if (!rowboolean[row][j-1] && !colboolean[col][j-1] && !san[row/3][col/3] [j-1]   ){
                board[row][col] =(char)(j+'0');
                rowboolean[row][j-1] =colboolean[col][j-1] =san[row/3][col/3][j-1] =true;
                track(board,i+1);
                rowboolean[row][j-1] =colboolean[col][j-1] =san[row/3][col/3][j-1] =false;
            }

        }



    }


}
