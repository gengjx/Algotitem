package 回溯经典问题.N皇后问题;

import java.util.Arrays;

/**
 * @Auther: gjx
 * @Date: 2020/12/10 - 12 - 10 - 22:05
 * @Description: 回溯经典问题  使用位运算进行 8皇后算法的模拟
 * @version: 1.0
 */
public class Nqueen_3 {
    int [] queen =new int[8];
    byte col=0 ;
    short left=0;
    short right=0;
    int max=8  ;
    int times =0 ;

    //放置 第 n 个皇后
    public void check(int n){
        if (n==this.max){
            System.out.println(Arrays.toString(queen));
            times++;
            return;
        }
        for (int i = 0; i <queen.length ; i++) {
            int cv =1<<i;
            if ((col&cv)!=0) continue;
            int lv =1<<(n-i+7);
            if ((left&lv)!=0) continue;
            int rv =1<<(n+i);
            if ((right&rv)!=0) continue;

            queen[n] =i;
            col |= cv;
            left |= lv;
            right |= rv;
            check(n+1);
            col &= (~cv);
            left &= (~lv);
            right &= (~rv);



        }
    }

}

class Test7{


    public static void main(String[] args) {
        Nqueen_3 nqueen =new Nqueen_3();
        nqueen.check(0);
        System.out.println(nqueen.times);

    }

}