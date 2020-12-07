package 设计模式.工厂模式.抽象工厂;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 12:22
 * @Description: 设计模式.工厂模式.抽象工厂
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        BigIceCream bigIceCream = new AppleIceCreamFactory().createBigIceCream();
        bigIceCream.taste();
        SmallIceCream smallIceCream =new AppleIceCreamFactory().createSmallIceCream();
        smallIceCream.taste();
    }
}
