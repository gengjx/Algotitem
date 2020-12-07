package 设计模式.工厂模式.工厂方法模式创建;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 11:14
 * @Description: 设计模式.工厂模式.工厂方法模式创建
 * @version: 1.0
 */
public class OFactory implements Factory {

    @Override
    public IceCream getICream() {
        return new OIceCream();
    }
}
