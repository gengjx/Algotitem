package 递归;

import org.junit.Test;

/**
 * @Auther: gjx
 * @Date: 2020/12/9 - 12 - 09 - 10:28
 * @Description: 递归  练习一 斐波那契数列(递归)/非递归  对于一组 1 1 2 3 5 8 13 这样一组序列求取对应位置的数据
 * @version: 1.0
 */
public class Fibonacci {

    //递归
    public int fibonacci(int n){
        if (n<=2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    //非递归
    public int fibonacci1(int n){
        if (n<=2){
            return 1;
        }
        int first =1;
        int second=1;
        for (int i = 3; i <=n ; i++) {
            second = second+first;
            first =second-first;
        }
        return second;
    }
    @Test
    public void test(){
        System.out.println(fibonacci(7));
        System.out.println(fibonacci1(7));
    }
}
