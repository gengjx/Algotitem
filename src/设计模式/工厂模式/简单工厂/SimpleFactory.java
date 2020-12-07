package 设计模式.工厂模式.简单工厂;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 10:54
 * @Description: 设计模式.工厂模式
 * @version: 1.0
 */
public class SimpleFactory {
    private static Car car;
    public static  Car getCar(String name){
        if (name.equals("奥托")){
            car = new AutuoCar();
        }
        else if (name.equals("特斯拉")){
           car =new TesilaCar();
        }
        else if (name.equals("宝马")){
            car =new baomaCar();
        }
        return car;
    }
}
