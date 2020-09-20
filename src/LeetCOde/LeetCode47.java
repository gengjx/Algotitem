package LeetCOde;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode47 {

    /*
    给定一个可包含重复数字的序列，返回所有不重复的全排列。

    示例:

    输入: [1,1,2]
    输出:
    [
        [1,1,2],
        [1,2,1],
        [2,1,1]
    ]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/permutations-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        track(result,new ArrayList<Integer>(),nums,new HashSet<Integer>());
        return result;
    }

    private void track(List<List<Integer>> result,ArrayList<Integer> now ,int[] nums, HashSet<Integer> set) {

        if (now.size()== nums.length){
            result.add(now);
            return;
        }

        for (int i=0;i<nums.length;i++){
            if (!set.contains(i-1)&&nums[i] == nums[i-1] &&i>0){
                    continue;
            }

            if (!set.contains(i)){
                now.add(nums[i]);
                set.add(i);
                track(result,now,nums,set);
                set.remove(i);
                now.remove(now.size()-1);
            }
        }


    }
}
