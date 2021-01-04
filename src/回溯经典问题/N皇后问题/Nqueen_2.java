package 回溯经典问题.N皇后问题;

import java.util.Arrays;

/**
 * @Auther: gjx
 * @Date: 2020/12/10 - 12 - 10 - 15:07
 * @Description: 回溯经典问题  对回溯进行一些优化:使用三个一维的布尔数组对 行 左对角线 右对角线进行判断
 *
 * @version: 1.0
 */
public class Nqueen_2 {

    //存放
    int [] queen;

    //判断列是否重复
    boolean [] col ;

    //左对角线
    boolean [] LDiagonal;


    //右对角线
    boolean [] RDiagonal;
    // 几皇后?
    int max ;
    int times =0 ;
    public Nqueen_2(int max) {
        queen =new int[max];
        this.max =max;
        col =new boolean[max];
        LDiagonal =new boolean[max<<1];
        RDiagonal =new boolean[LDiagonal.length];
    }

    //放置 第 n 个皇后
    public void check(int n){
        if (n==this.max){
            System.out.println(Arrays.toString(queen));
            times++;
            return;
        }
        for (int i = 0; i <queen.length ; i++) {
            if (col[i]) continue;
            int L  = n-i+queen.length-1;
            if (LDiagonal[L]) continue;
            int R  = n+i;
            if (RDiagonal[R]) continue;
            queen[n] =i;
            col[i] =true;
            LDiagonal[L] =true;
            RDiagonal[R] =true;
            check(n+1);
            col[i] =false;
            LDiagonal[L] =false;
            RDiagonal[R] =false;
        }
    }


}

class Test6{


    public static void main(String[] args) {
        Nqueen_2 nqueen =new Nqueen_2(8);
        nqueen.check(0);
        System.out.println(nqueen.times);

    }

}
