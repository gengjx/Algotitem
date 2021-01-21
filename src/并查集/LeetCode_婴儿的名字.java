package 并查集;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Auther: gjx
 * @Date: 2021/1/20 - 01 - 20 - 11:03
 * @Description: 并查集
 * @version: 1.0
 * 每年，政府都会公布一万个最常见的婴儿名字和它们出现的频率，也就是同名婴儿的数量。有些名字有多种拼法，例如，John 和 Jon 本质上是相同的名字，但被当成了两个名字公布出来。给定两个列表，一个是名字及对应的频率，另一个是本质相同的名字对。设计一个算法打印出每个真实名字的实际频率。注意，如果 John 和 Jon 是相同的，并且 Jon 和 Johnny 相同，则 John 与 Johnny 也相同，即它们有传递和对称性。
 * 在结果列表中，选择 字典序最小 的名字作为真实名字。
 * 示例：
 * 输入：names = ["John(15)","Jon(12)","Chris(13)","Kris(4)","Christopher(19)"], synonyms = ["(Jon,John)","(John,Johnny)","(Chris,Kris)","(Chris,Christopher)"]
 * 输出：["John(27)","Chris(36)"]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/baby-names-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode_婴儿的名字 {
    Map<String, String> map;
    public String[] trulyMostPopular(String[] names, String[] synonyms) {
        Map<String, Integer> cnt = new HashMap<>();
        map = new HashMap<>();

        for(String name : names) {
            int i = 0;
            while(name.charAt(i) != '(') i++;
            map.put(name.substring(0, i), name.substring(0, i));
        }

        for(String name : synonyms) {
            String[] temp = name.split(",");
            String x = temp[0].substring(1, temp[0].length());
            String y = temp[1].substring(0, temp[1].length() - 1);

            if(!map.containsKey(x)) map.put(x, x);
            if(!map.containsKey(y)) map.put(y, y);

            // 获得两个集合的根
            String fx = find(x);
            String fy = find(y);

            // 合并两个并查集，将字典序小的根作为新的根
            if(!fx.equals(fy)){
                if(fx.compareTo(fy) > 0)
                    map.put(fx, fy);
                else map.put(fy, fx);
            }
        }

        for(String name : names) {
            int i = 0;
            while(name.charAt(i) != '(') i++;

            // 将数值都累加到根的位置
            String root = find(name.substring(0, i));
            cnt.put(root, cnt.getOrDefault(root, 0) + Integer.parseInt(name.substring(i + 1, name.length() - 1)));
        }

        List<String> res = new ArrayList<>();

        for(String name : names) {
            int i = 0;
            while(name.charAt(i) != '(') i++;

            String root = find(name.substring(0, i));

            // 只输出根
            if(!root.equals(name.substring(0, i))) continue;

            res.add(root + "(" + String.valueOf(cnt.get(root)) + ")");
        }

        return res.toArray(new String[res.size()]);
    }

    // 查根
    public String find(String x) {
        if(!map.get(x).equals(x)) {
            map.put(x, find(map.get(x)));
        }

        return map.get(x);
    }


}
