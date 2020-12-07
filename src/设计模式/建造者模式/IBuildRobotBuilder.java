package 设计模式.建造者模式;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 14:05
 * @Description: 设计模式.建造者模式
 * @version: 1.0
 */
public class IBuildRobotBuilder implements IBuildRobot {
    private  Robot robot;

    public IBuildRobotBuilder(){
        robot =new Robot();
    }
    @Override
    public void buildHead() {
        robot.setHead("钛合金头部");
        System.out.println("创建首部");
    }

    @Override
    public void buildBody() {
        robot.setBody("不锈钢身体");
        System.out.println("创建身体");
    }

    @Override
    public void buildHand() {
        robot.setHand("黑铁手臂");
        System.out.println("创建手臂");
    }

    @Override
    public void buildFoot() {
        robot.setFoot("钻石腿部");
        System.out.println("创建机器人腿部");
    }

    @Override
    public Robot createRobot() {
        return robot;
    }


}
