package 设计模式.工厂模式.工厂方法模式创建;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 11:16
 * @Description: 设计模式.工厂模式.工厂方法模式创建
 * @version: 1.0
 */
public class Test {


    public static void main(String[] args) {
        IceCream iceCream =new OFactory().getICream();
        System.out.println(iceCream.taste());
        IceCream iceCream1 =new SIceFactory().getICream();
        System.out.println(iceCream1.taste());
    }

}
