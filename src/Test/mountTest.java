package Test;

import java.math.BigDecimal;

/**
 * @Auther: gjx
 * @Date: 2021/1/5 - 01 - 05 - 10:18
 * @Description: Test
 * @version: 1.0
 */
public class mountTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal =new BigDecimal("0.1");
        BigDecimal bigDecimal1 = new BigDecimal("22.5");
        BigDecimal bigDecimal2 = bigDecimal.multiply(bigDecimal1);
        System.out.println(bigDecimal2);

    }
}
