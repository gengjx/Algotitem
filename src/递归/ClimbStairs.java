package 递归;

import org.junit.Test;

/**
 * @Auther: gjx
 * @Date: 2020/12/9 - 12 - 09 - 10:44
 * @Description: 递归  上楼梯函数 题目描述: 对于一组高度为n的楼梯序列 每次只能选择 1/2步上楼梯 求出有多少种解法
 * 思路:
 *      对于 n =1 的楼梯只有一种 解法
 *      对于 n=2  的楼梯只有两种解法
 *      对于一个大于2楼梯  F(n-1)+F(n-2)
 * @version: 1.0
 */
public class ClimbStairs {
    //递归
    public int climbStairs(int n){
        if (n<=2)
            return n;
        return climbStairs(n-1)+climbStairs(n-2);

    }
    //非递归
    public int climbStairs1(int n){
        if (n<=2)
            return n;
        int first =1;
        int second =2;
        for (int i=3;i<=n;i++){
            second =first+second;
            first =second-first;

        }
        return second;

    }


    @Test
    public void test(){
        System.out.println(climbStairs(13));
        System.out.println(climbStairs1(13));
    }

}
