package Collection;

import org.junit.Test;

import java.util.*;

public class ListTest {
    /*
        ListTest 接口 有序  不唯一
            ArrayList  LinkedList  Vector
            ArrayList 和 Vector 区别 线程安全问题  Vector是线程安全的容器
            ArrayList 不是线程安全的容器







     */
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0);

        System.out.println(list);

        //排序
        Collections.sort(list);
        System.out.println("排序后"+": "+list);

        //遍历

        for (Integer i : list){
            System.out.println(i);
        }

        //普通循环
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //迭代器
        Iterator iterator =list.iterator();

        while(iterator.hasNext()){
            System.out.println("迭代器遍历"+iterator.next());
        }




    }

    @Test
    public void testLinkedList(){
        List<Integer> list =new LinkedList();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(-3);
        System.out.println("输入的List内容为" +
                ""+list);

        //排序
        Collections.sort(list);
        System.out.println("排序后的List:"+list);

        //For循环遍历
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("方式二:");
        //强制For
        for (int i :list){
            System.out.println(i);
        }
        System.out.println("方式三:");
        //迭代器
        Iterator iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
