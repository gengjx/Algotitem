package 并查集;

import java.util.Arrays;

/**
 * @Auther: gjx
 * @Date: 2020/12/8 - 12 - 08 - 12:34
 * @Description: 并查集 基于重量(孩子的数量和并)
 * @version: 1.0
 */
public class QuickUnion_Find_Weight extends AbstractUnion{
    public int [] weight;

    public QuickUnion_Find_Weight(int capacity) {
        super(capacity);
        weight =new int[capacity];
        for (int i = 0; i < weight.length; i++) {
            weight[i] =1;
        }
    }

    @Override
    void union(int v1, int v2) {
        int  left = parents[v1];
        int  right =parents[v2];
        if (left != right){
            if (weight[left]>weight[right]){
                parents[right] =left;
                weight[left]+=weight[right];
            }
            else {
                parents[left] =right;
                weight[right]+=weight[left];
            }
        }
    }

    @Override
    int find(int v) {
        while(parents[v] != v){
            //路径压缩
            //parents[v] =parents[parents[v]];
            v =parents[v];
        }
        return v;
    }
}

class Test3{
    public static void main(String[] args) {
        QuickUnion_Find_Weight abstractUnion =new QuickUnion_Find_Weight(10);
        System.out.println(Arrays.toString(abstractUnion.parents));
        System.out.println(Arrays.toString((abstractUnion).weight));
        System.out.println("======================================");
        abstractUnion.union(5,6);

        System.out.println(Arrays.toString(abstractUnion.parents));
        System.out.println(Arrays.toString((abstractUnion).weight));

        System.out.println("======================================");
        abstractUnion.union(1,2);

        System.out.println(Arrays.toString(abstractUnion.parents));
        System.out.println(Arrays.toString((abstractUnion).weight));
        System.out.println("======================================");
        abstractUnion.union(2,3);

        System.out.println(Arrays.toString(abstractUnion.parents));
        System.out.println(Arrays.toString((abstractUnion).weight));
        System.out.println("======================================");
        abstractUnion.union(1,4);

        System.out.println(Arrays.toString(abstractUnion.parents));
        System.out.println(Arrays.toString((abstractUnion).weight));
        System.out.println("======================================");
        abstractUnion.union(2,5);


        System.out.println(Arrays.toString(abstractUnion.parents));
        System.out.println(Arrays.toString((abstractUnion).weight));
        System.out.println("======================================");

        System.out.println(Arrays.toString(abstractUnion.parents));
        System.out.println(Arrays.toString((abstractUnion).weight));
        System.out.println("======================================");

        System.out.println(abstractUnion.isCommon(1,5));


    }
}
