package 设计模式.原型模式;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 14:38
 * @Description: 设计模式.原型模式
 * @version: 1.0
 */

public class User implements Cloneable,Serializable

{
    private  int  age;
    private  String name;
    private Date date;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
    //浅克隆
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return (User)super.clone();
//    }

    //深克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {

        User user =(User) super.clone();
        user.setDate(this.date);
        return user;
    }
}
