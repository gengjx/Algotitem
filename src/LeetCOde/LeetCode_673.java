package LeetCOde;

/**
 * @Auther: gjx
 * @Date: 2021/1/24 - 01 - 24 - 14:40
 * @Description: LeetCOde
 * @version: 1.0
 * 673. 最长递增子序列的个数
 * 给定一个未排序的整数数组，找到最长递增子序列的个数。
 * 示例 1:
 * 输入: [1,3,5,4,7]
 * 输出: 2
 * 解释: 有两个最长递增子序列，分别是 [1, 3, 4, 7] 和[1, 3, 5, 7]。
 * 示例 2:
 * 输入: [2,2,2,2,2]
 * 输出: 5
 * 解释: 最长递增子序列的长度是1，并且存在5个子序列的长度为1，因此输出5。
 * 注意: 给定的数组长度不超过 2000 并且结果一定是32位有符号整数。
 */
public class LeetCode_673 {
    public int findNumberOfLIS(int[] nums) {
        if (null ==nums || nums.length ==0)
            return  0;
        if (nums.length == 1){
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {

        }
        
        return 0;
    }
}
