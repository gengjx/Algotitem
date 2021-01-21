package LeetCOde;

/**
 * @Auther: gjx
 * @Date: 2021/1/17 - 01 - 17 - 15:00
 * @Description: LeetCOde
 * @version: 1.0
 * 在一个 XY 坐标系中有一些点，我们用数组 coordinates 来分别记录它们的坐标，其中 coordinates[i] = [x, y] 表示横坐标为 x、纵坐标为 y 的点。
 * 请你来判断，这些点是否在该坐标系中属于同一条直线上，是则返回 true，否则请返回 false。
 * 示例 1：
 * 输入：coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 * 输出：true
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-if-it-is-a-straight-line
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class leetcode_1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        //k为斜率
        // k= (y1-y0)/(x1-x0)=(yi-y0)/(xi-x0)  转变成为乘法;
        //   (y1-y0)*(xi-x0)=(yi-y0)*(x1-x0)
        for (int i = 2; i < coordinates.length; i++) {
            if ((coordinates[1][1] - coordinates[0][1]) * (coordinates[i][0] - coordinates[0][0])
                    != (coordinates[i][1] - coordinates[0][1]) * (coordinates[1][0] - coordinates[0][0])) {
                return false;
            }
        }
        return true;
    }
}
