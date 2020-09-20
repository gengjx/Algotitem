package Collection;

import org.junit.Test;

import java.util.*;

public class List1 {
    public static void main(String[] args) {
        /*
            Collection接口下面有两个接口List和Set和Queue接口
          可重复:
            List接口线下面:
                ArrayList :数组实现 线程不安全 查找快 增加删除慢
                LinkedList 链表实现 线程不安全 增加删除快 查找慢
                Vector  数组实现 线程安全 增加删除慢 查找快
          不可重复
            Set接口
                HashSet:
                    哈希表
                    保证唯一性:HashCode 和equals

                TreeSet 排序
                    红黑树
                LinkedhashSet 先进先出
                    链表+哈希表
        Map接口
         有序
            HashMap:
                线程不安全 可以存储null 速度快
             Hashtable
                线程安全  不可以存储null 速度慢
         无需
            TreeMap
                线程
         */
        List list =new  ArrayList();
        list.add(1);
        list.add(2);
        System.out.println(list);
        List list1 =new Vector();
        list1.add(1);
        list1.add(2);
        System.out.println(list1);

        List list2 =new LinkedList();
        list2.add(1);
        list2.add(1);
        System.out.println(list2);

    }
    @Test
    public void testMap(){
        Map map1 =new HashMap();
        map1.put(null,"hello");
        System.out.println(map1);

        Map map =new Hashtable();
        map.put("key",1);
        System.out.println(map);



    }

}
