package LeetCOde;


import java.util.ArrayList;
import java.util.List;

public class LeetCode0908 {
    /*
    无重复字符串的排列组合。编写一种方法，计算某字符串的所有排列组合，字符串每个字符均不相同。

示例1:

 输入：S = "qwe"
 输出：["qwe", "qew", "wqe", "weq", "ewq", "eqw"]
示例2:

 输入：S = "ab"
 输出：["ab", "ba"]
提示:

字符都是英文字母。
字符串长度在[1, 9]之间。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/permutation-i-lcci
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public String[] permutation(String S) {
        List<String> result =new ArrayList<>();
        char [] chars =S.toCharArray();
        boolean[] used = new boolean[S.length()];
        track(result,chars,new StringBuilder(),used);

        String [] s = (String[]) result.toArray();
        return  s;
    }

    public void track(List<String> result, char[] chars, StringBuilder string, boolean[] used) {
        if (chars.length ==string.length()){
            result.add(string.toString());
            return;
        }

        for (int i =0 ;i<chars.length;i++){
            if (!used[i]){
                string.append(string);
                used[i] =true;
                track(result,chars,string, used);
                string.replace(string.length(),string.length()+1,"");
                used[i] =false;
            }

        }

    }
}
