package 设计模式.建造者模式;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 14:18
 * @Description: 设计模式.建造者模式
 * @version: 1.0
 */
public class Director  {
    public Robot createRoot(IBuildRobotBuilder iBuildRobotBuilder){
        iBuildRobotBuilder.buildHead();
        iBuildRobotBuilder.buildBody();
        iBuildRobotBuilder.buildFoot();
        iBuildRobotBuilder.buildHand();
        return iBuildRobotBuilder.createRobot();
    }
}
