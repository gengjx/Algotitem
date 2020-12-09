package 并查集;

/**
 * @Auther: gjx
 * @Date: 2020/12/8 - 12 - 08 - 10:41
 * @Description: 并查集   并查集的操作意义 实现一种数据结构判断两个点直接是否能够连接
 * 并查集实现的功能:
 *      1.查询某一个点的父亲
 *      2.合并两个点所属于的集合
 * @version: 1.0
 */
public  abstract  class AbstractUnion {
    int [] parents;

    public AbstractUnion(int capacity){
        if (capacity<0){
            throw new RuntimeException("初始化不顺利,大哥请输入正常的数字");
        }
        parents =new int[capacity];
        for (int i=0;i<capacity;i++){
            parents[i] =i;
        }
    }

    abstract void union(int v1,int v2);


    abstract int find(int v);


    boolean isCommon(int v1,int v2){
        return find(v1)==find(v2) ? true :false;
    }

}
