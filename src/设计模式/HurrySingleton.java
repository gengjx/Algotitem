package 设计模式;

public class HurrySingleton {
    private static final HurrySingleton h =new HurrySingleton();

    private static HurrySingleton getInstance(){
        return h;
    }
}
