package LeetCOde;

import java.util.Arrays;

/**
 * @Auther: gjx
 * @Date: 2021/1/20 - 01 - 20 - 10:05
 * @Description: LeetCOde
 * @version: 1.0
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: 6
 *
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: 24
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-product-of-three-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode_628 {
    public int maximumProduct(int[] nums) {

        if (null == nums || nums.length<3){
            return  0;
        }

        if (nums.length == 3){
            return nums[0]*nums[1]*nums[2];
        }

        Arrays.sort(nums);


        return Math.max(nums[0]*nums[1]*nums[2],nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-2] );
    }


}
