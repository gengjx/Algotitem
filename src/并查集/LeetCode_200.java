package 并查集;

/**
 * @Auther: gjx
 * @Date: 2021/1/15 - 01 - 15 - 18:32
 * @Description: 并查集
 * @version: 1.0
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 * 示例 1：
 * 输入：grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * 输出：1
 * 示例 2：
 * 输入：grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * 输出：3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-islands
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode_200 {
    public int numIslands(char[][] grid) {
        if (grid==null||grid[0].length<1){
            return 0;
        }
        int sum =0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (grid[i][j]=='1'){
                    dfs(grid,i,j);
                    sum++;
                }


            }
        }
        return sum;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i<0||j<0||i>grid.length||j>grid[j].length||grid[i][j]!='1'){
            return;
        }

        grid[i][j] ='2';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);


    }

}


