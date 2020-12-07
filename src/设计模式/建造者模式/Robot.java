package 设计模式.建造者模式;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 12:57
 * @Description: 设计模式.建造者模式
 * @version: 1.0
 */

public class Robot {
    private String head;
    private String body;
    private String hand;
    private String foot;
    public String getHead() {
        return head;
    }
    public void setHead(String head) {
        this.head = head;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getHand() {
        return hand;
    }
    public void setHand(String hand) {
        this.hand = hand;
    }
    public String getFoot() {
        return foot;
    }
    public void setFoot(String foot) {
        this.foot = foot;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", hand='" + hand + '\'' +
                ", foot='" + foot + '\'' +
                '}';
    }
}
