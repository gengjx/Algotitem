package 并查集;

import org.junit.Test;

/**
 * @Auther: gjx
 * @Date: 2021/1/15 - 01 - 15 - 23:15
 * @Description: 并查集
 * @version: 1.0
 * n 块石头放置在二维平面中的一些整数坐标点上。每个坐标点上最多只能有一块石头。
 * 如果一块石头的 同行或者同列 上有其他石头存在，那么就可以移除这块石头
 * 给你一个长度为 n 的数组 stones ，其中 stones[i] = [xi, yi] 表示第 i 块石头的位置，返回 可以移除的石子 的最大数量。
 * 示例 1：
 *
 * 输入：stones = [[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]]
 * 输出：5
 * 解释：一种移除 5 块石头的方法如下所示：
 * 1. 移除石头 [2,2] ，因为它和 [2,1] 同行。
 * 2. 移除石头 [2,1] ，因为它和 [0,1] 同列。
 * 3. 移除石头 [1,2] ，因为它和 [1,0] 同行。
 * 4. 移除石头 [1,0] ，因为它和 [0,0] 同列。
 * 5. 移除石头 [0,1] ，因为它和 [0,0] 同行。
 * 石头 [0,0] 不能移除，因为它没有与另一块石头同行/列。
 * 示例 2：
 * 输入：stones = [[0,0],[0,2],[1,1],[2,0],[2,2]]
 * 输出：3
 * 解释：一种移除 3 块石头的方法如下所示：
 * 1. 移除石头 [2,2] ，因为它和 [2,0] 同行。
 * 2. 移除石头 [2,0] ，因为它和 [0,0] 同列。
 * 3. 移除石头 [0,2] ，因为它和 [0,0] 同行。
 * 石头 [0,0] 和 [1,1] 不能移除，因为它们没有与另一块石头同行/列。
 * 示例 3：
 * 输入：stones = [[0,0]]
 * 输出：0
 * 解释：[0,0] 是平面上唯一一块石头，所以不可以移除它。
 * 提示：
 *
 *     1 <= stones.length <= 1000
 *     0 <= xi, yi <= 104
 *     不会有两块石头放在同一个坐标点上
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/most-stones-removed-with-same-row-or-column
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class leetcode_947 {
    int [] parents;
    int [] weight;
    int sum =0 ;

    public int removeStones(int[][] stones) {

        if (null==stones||stones.length<1)
            return 0;
        parents =new int[stones.length];
        weight = new int[parents.length];
        for (int i = 0; i < parents.length; i++) {
            parents[i] =i;
            weight[i] =1;
            sum =parents.length;
        }

        for (int i = 0; i < stones.length; i++) {
            for (int j = i + 1; j < stones.length; j++) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    union(i, j);
                }
            }
        }
        int total =stones.length;
        return total-sum;
    }

    private void union(int i, int j) {

        int left =find(i);

        int right =find(j);

        if (left !=right){
            parents[left] =right;
            weight[right]+=weight[left];
            sum--;
        }

    }

    private int find(int j) {
        while (parents[j]!=j)
            j =parents[j];
        return j;
    }





}
