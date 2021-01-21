package 并查集;

/**
 * @Auther: gjx
 * @Date: 2021/1/14 - 01 - 14 - 17:01
 * @Description: 并查集
 * @version: 1.0
 *
 * 题目描述:
 * 有 n 个城市，其中一些彼此相连，另一些没有相连。如果城市 a 与城市 b 直接相连，且城市 b 与城市 c 直接相连，那么城市 a 与城市 c 间接相连。
 *
 * 省份 是一组直接或间接相连的城市，组内不含其他没有相连的城市。
 *
 * 给你一个 n x n 的矩阵 isConnected ，其中 isConnected[i][j] = 1 表示第 i 个城市和第 j 个城市直接相连，而 isConnected[i][j] = 0 表示二者不直接相连。
 *
 * 返回矩阵中 省份 的数量。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-provinces
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode_547 {

    public int findCircleNum(int[][] isConnected) {

        int num =0;
        int parent[]  =new int[isConnected.length];
        for (int i = 0; i < parent.length; i++) {
              parent[i] =i;
        }
        for (int i =0;i<isConnected.length;i++){
            for (int j =i+1 ;j<isConnected[i].length;i++){
                if (isConnected[i][j]!=0){
                    union(parent,i,j);
                }
            }
        }

        for (int i = 0; i < parent.length; i++) {
            if (parent[i]==i)
                num++;
        }
        return num;
    }

    public void  union(int[] parent,int left, int right){
        parent[parent[left] ] =parent[right];
    }
    public int find(int [] parent,int index){
        while (parent[index] !=index)
            index =parent[index];
        return index;
    }

    public static void main(String[] args) {

    }
}
