package enums;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 17:31
 * @Description: enums
 * @version: 1.0
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println("支付方式配置枚举类测试");
        System.out.println(ResultCode.BANK_RECEIVE.getCode());
        System.out.println(ResultCode.BANK_RECEIVE.getMessage());
    }
}
