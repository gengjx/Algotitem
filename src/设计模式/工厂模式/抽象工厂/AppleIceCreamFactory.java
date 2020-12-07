package 设计模式.工厂模式.抽象工厂;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 12:19
 * @Description: 设计模式.工厂模式.抽象工厂
 * @version: 1.0
 */
public class AppleIceCreamFactory implements IceCreamFactory {
    @Override
    public BigIceCream createBigIceCream() {
        return new BigAppleIceCream();
    }

    @Override
    public SmallIceCream createSmallIceCream() {
        return new SmallAppleIceCream();
    }
}
