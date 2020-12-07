package 设计模式.建造者模式;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 14:25
 * @Description: 设计模式.建造者模式
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Director director =new Director();
        Robot robot =director.createRoot(new IBuildRobotBuilder() );
        System.out.println(robot.toString());
    }
}
