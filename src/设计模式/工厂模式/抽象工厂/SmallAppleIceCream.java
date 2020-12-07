package 设计模式.工厂模式.抽象工厂;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 12:10
 * @Description: 设计模式.工厂模式.抽象工厂
 * @version: 1.0
 */
public class SmallAppleIceCream implements SmallIceCream {
    @Override
    public void taste() {
        System.out.println("苹果味小冰淇淋");
    }
}
