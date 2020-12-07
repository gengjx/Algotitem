package 设计模式.桥接模式;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 15:57
 * @Description: 设计模式.桥接模式
 * @version: 1.0
 */
public abstract class computer {
    private Brand brand;

    public computer(Brand brand) {
        this.brand = brand;
    }

    public void sale(){
        brand.brandName();
    }
}

class Taishi extends computer{

    public Taishi(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("台式电脑");
    }

}


class Test{


    public static void main(String[] args) {
        computer computer =new Taishi(new Leveno());
        computer.sale();

        computer computer1 =new Taishi(new Huawei());
        computer1.sale();
    }
}