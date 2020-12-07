package 设计模式.适配器模式.对象的适配器模式;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 15:32
 * @Description: 设计模式.适配器模式
 * @version: 1.0
 */
public class Adapter  implements Target {

    Adaptee adaptee ;
    @Override
    public void method1() {
        adaptee =new Adaptee();
        adaptee.method1();
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

}

class  Test
{
    public static void main(String[] args) {
        Adapter adapter =new Adapter();
        adapter.method1();
        adapter.method2();
    }
}