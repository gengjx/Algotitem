package 并查集;

import java.util.Arrays;

/**
 * @Auther: gjx
 * @Date: 2020/12/8 - 12 - 08 - 12:49
 * @Description: 并查集  基于秩的并查集
 * @version: 1.0
 */
public class QuickUnion_Find_height extends AbstractUnion {
   public int [] height;


    public QuickUnion_Find_height(int capacity) {
        super(capacity);
        height =new int[capacity];
        for (int i = 0; i <height.length ; i++) {
            height[i] =0;
        }
    }

    @Override
    void union(int v1, int v2) {
        int left = find(v1);
        int right =find(v2);

        if (left != right){
            if (height[left]>height[right]){
                parents[right] =left;

            }
            else if(height[left]<height[right]){
                parents[left] =right;
            }
            else {
                parents[left] =right;
                height[right]++;

            }
        }

    }

    @Override
    int find(int v) {
        while(parents[v] != v){
            v =parents[v];
        }
        return v;
    }
}
class Test2{
    public static void main(String[] args) {
        QuickUnion_Find_height  abstractUnion =new QuickUnion_Find_height(10);
        System.out.println(Arrays.toString(abstractUnion.parents));
        abstractUnion.union(5,6);
        System.out.println(Arrays.toString(abstractUnion.parents));
        System.out.println(Arrays.toString(abstractUnion.height));
        System.out.println("=================================================");
        abstractUnion.union(1,2);
        System.out.println(Arrays.toString(abstractUnion.parents));
        System.out.println(Arrays.toString(abstractUnion.height));
        System.out.println("=================================================");
        abstractUnion.union(2,3);
        System.out.println(Arrays.toString(abstractUnion.parents));
        System.out.println(Arrays.toString(abstractUnion.height));
        System.out.println("=================================================");
        abstractUnion.union(1,4);
        System.out.println(Arrays.toString(abstractUnion.parents));
        System.out.println(Arrays.toString(abstractUnion.height));
        System.out.println("=================================================");
        abstractUnion.union(2,5);
        System.out.println(Arrays.toString(abstractUnion.parents));
        System.out.println(Arrays.toString(abstractUnion.height));
        System.out.println("=================================================");
        System.out.println(Arrays.toString(abstractUnion.parents));
        System.out.println(Arrays.toString(abstractUnion.height));
        System.out.println(abstractUnion.isCommon(1,6));
    }
}