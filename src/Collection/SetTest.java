package Collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    /*
        TreeSet是基于红黑树实现的 有序的Set接口  有序 唯一
        HashSet 无序 唯一 通过哈希表实现的
        LinkedHashSet
     */
    @Test
    public void testTreeSet(){
        Set<Integer> set =new TreeSet();
        set.add(1);
        set.add(1);
        set.add(4);
        set.add(0);
        System.out.println(set);

//        Iterator iterator =set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        TreeSet set1 = (TreeSet)set;
        Iterator iterator1 =((TreeSet<Integer>) set).descendingIterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


     }

}
