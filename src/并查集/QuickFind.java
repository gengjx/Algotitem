package 并查集;

import java.util.Arrays;

/**
 * @Auther: gjx
 * @Date: 2020/12/8 - 12 - 08 - 10:49
 * @Description: 并查集  快查询 慢合并
 * @version: 1.0
 */
public class QuickFind extends AbstractUnion {
    public QuickFind(int capacity) {
        super(capacity);
    }

    //慢合并
    @Override
    void union(int v1, int v2) {
        int left =find(v1);
        int right =find(v2);
        if(left!=right){
            for (int i = 0; i <parents.length ; i++) {
                if (parents[i] ==left){
                    parents[i] =right;
                }

            }
        }

    }

    //快查询
    @Override
    int find(int v) {
        return parents[v];
    }



}

class Test{
    public static void main(String[] args) {
        AbstractUnion abstractUnion =new QuickFind(5);
        System.out.println(Arrays.toString(abstractUnion.parents));
        abstractUnion.union(1,0);
        abstractUnion.union(1,2);
        System.out.println(Arrays.toString(abstractUnion.parents));

        System.out.println(abstractUnion.isCommon(1,3));
    }
}



