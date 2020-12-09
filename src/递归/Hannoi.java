package 递归;

import org.junit.Test;

/**
 * @Auther: gjx
 * @Date: 2020/12/9 - 12 - 09 - 10:59
 * @Description: 递归  塔诺牌有三根柱子 n个盘子 每次只能移动一个盘子 大盘子只能在小盘子下面
 * 思路:
 *      1. 将 n-1 盘子挪动到 B柱子
 *      2. 将第 n 个盘子移动扫 C柱子
 *      3.将n -1 个盘子移动到C柱子
 * @version: 1.0
 */
public class Hannoi {

    public void  hannoi(int n,String p1,String p2,String p3){
        if (n==1){
            move(n,p1,p3);
            return;
        }
        hannoi(n-1,p1,p3,p2);
        move(n,p1,p3);
        hannoi(n-1,p2,p1,p3);

    }

    private void move(int n, String p1, String p3) {
        System.out.println("将" + n + "号盘子从" + p1 + "柱子" + "移动到了" + p3 + "柱子");
    }

    @Test
    public void test(){
        hannoi(4,"A","B","C");
    }

}
