package 并查集;

import java.util.Arrays;

/**
 * @Auther: gjx
 * @Date: 2020/12/8 - 12 - 08 - 11:08
 * @Description: 并查集  慢查询 快合并
 * @version: 1.0
 */
public class QuickUnion extends AbstractUnion {
    public QuickUnion(int capacity) {
        super(capacity);
    }

    @Override
    void union(int v1, int v2) {
        int left =find(v1);

        int right =find(v2);

        if (left !=right){
            parents[left] =right;
        }


    }

    @Override
    int find(int v) {
        while (v != parents[v]){
            v =parents[v];
        }

        return v;
    }

}

class Test1{
    public static void main(String[] args) {
        AbstractUnion abstractUnion =new QuickUnion(5);
        System.out.println(Arrays.toString(abstractUnion.parents));
        abstractUnion.union(1,0);
        abstractUnion.union(1,2);
        abstractUnion.union(4,1);
        System.out.println(Arrays.toString(abstractUnion.parents));

        System.out.println(abstractUnion.isCommon(1,3));
    }
}
