package 设计模式.桥接模式;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 15:56
 * @Description: 设计模式.桥接模式
 * @version: 1.0
 */
public class Huawei implements Brand{

    @Override
    public void brandName() {
        System.out.print("华为,");
    }
}
