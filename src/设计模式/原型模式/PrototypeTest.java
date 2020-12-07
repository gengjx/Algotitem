package 设计模式.原型模式;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 14:40
 * @Description: 设计模式.原型模式
 * @version: 1.0
 */
public class PrototypeTest {
//    public static void main(String[] args) throws CloneNotSupportedException {
//        User user1 =new User();
//        user1.setAge(18);
//        user1.setName("耿嘉新");
//        Calendar calendar =Calendar.getInstance();
//        calendar.setTime(new Date());
//        calendar.set(1999,9,21);
//        user1.setDate(calendar.getTime());
//        System.out.println(user1.toString());
//
//        User user2 =(User) user1.clone();
//        System.out.println(user2.toString());
//
//        calendar =Calendar.getInstance();
//        calendar.setTime(new Date());
//        calendar.set(1998,10,21);
//        user1.setDate(calendar.getTime());
//        System.out.println("测试深克隆和浅克隆");
//        System.out.println(user1.toString());
//        System.out.println(user2.toString());
//
//    }

    public static void main(String[] args) throws CloneNotSupportedException, Exception {
        Date date =  new Date(1231231231231l);
        User user = new User();
        user.setName("耿嘉新");
        user.setAge(18);
        user.setDate(date);
        System.out.println("-----原型对象的属性------");
        System.out.println(user);
        System.out.println(user.getName());
        System.out.println(user.getDate());

        //使用序列化和反序列化实现深复制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(user);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        //克隆好的对象！
        User user1 = (User) ois.readObject();

        // 修改原型对象的值
        date.setTime(221321321321321l);
        user.setDate(date);
        System.out.println(user.getDate());

        System.out.println("------克隆对象的属性-------");
        System.out.println(user1);
        System.out.println(user1.getName());
        System.out.println(user1.getDate());
    }
}
