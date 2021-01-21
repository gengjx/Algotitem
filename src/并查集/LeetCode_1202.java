package 并查集;

import org.junit.Test;

import java.util.*;

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
   "udyyek"
   [[3,3],[3,0],[5,1],[3,1],[3,4],[3,5]]
 */
public class LeetCode_1202 {
    int [] parents ;
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {

        String result ="" ;

        init(s.length());
        //System.out.println(Arrays.toString(parents));
        for (List<Integer> temp  : pairs ){
            if (temp.get(0) != temp.get(1)){
                    union(temp.get(0),temp.get(1));

            }



        }
        //System.out.println(Arrays.toString(parents));

        String [] results =new String[s.length()];
        //获取连通集合
        Map<Integer, List<Integer> > map =new HashMap<>();
        for (int i = 0; i <parents.length ; i++) {
            results[i] = s.charAt(i)+"";
            if (parents[i] == i){
                List list =new ArrayList();
                list.add(i);
                map.put(i,list);
            }
            else{
                int parent  = findParent(i);
                ArrayList<Integer> lists =new ArrayList();
                lists.add(parent);
                List<Integer> list = map.getOrDefault(parent,lists);
                list.add(list.size(),i);
            }


        }
        //System.out.println(map);


        //调整位置
        for (List<Integer> list:map.values()){
            List<String> list1 = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                int index = list.get(i);
                char c =s.charAt(index);

                list1.add(c+"");
            }
            //System.out.println(list1);
            Collections.sort(list1);
            for (int i = 0; i < list1.size(); i++) {
                results[list.get(i)] =list1.get(i);
            }
        }

        //System.out.println(Arrays.toString(results));

        for (int i = 0; i < results.length; i++) {
            result+=results[i];
        }





        return  result;

    }

    private void union(Integer left, Integer right) {
        int leftParent =findParent(left);
        int rightParent =findParent(right);

        if (leftParent != rightParent){
            if (leftParent<rightParent){
                parents[rightParent] = leftParent;
            }
            else {
                parents[leftParent] = rightParent;
            }

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

    @Test
    public void test(){
        List<List<Integer>> pairs =new ArrayList<>();
        List<Integer> list =new ArrayList<>();
        list.add(3);
        list.add(3);
        pairs.add(new ArrayList<>(list));
        list.clear();
        list.add(3);
        list.add(0);
        pairs.add(new ArrayList<>(list));
        list.clear();
        list.add(5);
        list.add(1);
        pairs.add(new ArrayList<>(list));
        list.clear();
        list.add(3);
        list.add(1);
        pairs.add(new ArrayList<>(list));
        list.clear();
        list.add(3);
        list.add(4);
        pairs.add(new ArrayList<>(list));
        list.clear();
        list.add(3);
        list.add(5);
        pairs.add(new ArrayList<>(list));
        System.out.println(pairs);
        String s ="udyyek";
        String result =smallestStringWithSwaps(s,pairs);
        System.out.println(result);


    }


}
