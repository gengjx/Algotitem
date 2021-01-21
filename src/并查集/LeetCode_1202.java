package 并查集;

import org.junit.Test;

import java.util.List;

/**
 * @Auther: gjx
 * @Date: 2021/1/21 - 01 - 21 - 10:24
 * @Description: 并查集
 * @version: 1.0
 * 给你一个字符串 s，以及该字符串中的一些「索引对」数组 pairs，其中 pairs[i] = [a, b] 表示字符串中的两个索引（编号从 0 开始）。
 * 你可以 任意多次交换 在 pairs 中任意一对索引处的字符。
 * 返回在经过若干次交换后，s 可以变成的按字典序最小的字符串。
 * 示例 1:
 * 输入：s = "dcab", pairs = [[0,3],[1,2]]
 * 输出："bacd"
 * 解释：
 * 交换 s[0] 和 s[3], s = "bcad"
 * 交换 s[1] 和 s[2], s = "bacd"
 * 示例 2：
 * 输入：s = "dcab", pairs = [[0,3],[1,2],[0,2]]
 * 输出："abcd"
 * 解释：
 * 交换 s[0] 和 s[3], s = "bcad"
 * 交换 s[0] 和 s[2], s = "acbd"
 * 交换 s[1] 和 s[2], s = "abcd"
 * 示例 3
 * 输入：s = "cba", pairs = [[0,1],[1,2]]
 * 输出："abc"
 * 解释：
 * 交换 s[0] 和 s[1], s = "bca"
 * 交换 s[1] 和 s[2], s = "bac"
 * 交换 s[0] 和 s[1], s = "abc"
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/smallest-string-with-swaps
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode_1202 {

    int [] parents ;
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {

        String result =s ;

        init(s.length());
        for (List<Integer> temp  : pairs ){
            union(temp.get(0),temp.get(1));
        }

        //获取连通集合




        return  result;

    }

    private void union(Integer left, Integer right) {
        int leftParent =findParent(left);
        int rightParent =findParent(right);

        if (leftParent != rightParent){
            parents[rightParent] = leftParent;
        }
    }

    private int findParent(Integer left) {
        while (parents[left] != left){
            left = parents[left];
        }


        return  left;
    }

    public  void init(int size){
        parents =new int[size];
        for (int i = 0; i <parents.length ; i++) {
            parents[i] = i ;
        }
    }


}
