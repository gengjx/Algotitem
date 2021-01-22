package LeetCOde;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: gjx
 * @Date: 2021/1/22 - 01 - 22 - 14:28
 * @Description: LeetCOde
 * @version: 1.0给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * 示例 1:
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * 提示：
 *     每个字符串仅由字符 '0' 或 '1' 组成。
 *     1 <= a.length, b.length <= 10^4
 *     字符串如果不是 "0" ，就都不含前导零。
 *
 */
public class LeetCode_67 {

    public String addBinary(String a, String b) {
        StringBuffer stringBuffer =new StringBuffer();
        int Quotient = 0;
        int aindex = a.length()-1;
        int bindex = b.length()-1;
        while (aindex>=0 || bindex>=0 || Quotient>0){
           int  result =+Quotient ;
           if (aindex>=0){
                 result +=Integer.valueOf(a.charAt(aindex--)+"");
           }
           if (bindex>=0){
               result +=
                       Integer.valueOf(b.charAt(bindex--)+"");
           }
           stringBuffer.append(result%2);
           Quotient = result/2;
        }
        return  stringBuffer.reverse().toString();
    }


    @Test
    public  void test(){
        String str1 ="1";
        String str2  ="11";
        String result =addBinary(str1,str2);
        System.out.println(result);
    }

}
