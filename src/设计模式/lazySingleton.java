package 设计模式;

public class lazySingleton {
    private static  lazySingleton lazySingleton =null;
    private lazySingleton getInstance(){
//        if (lazySingleton==null){
////            lazySingleton =new lazySingleton();
////        }
//        synchronized (lazySingleton.class){
//                    if (lazySingleton==null){
//                 lazySingleton =new lazySingleton();
//             }
//        }
        if (lazySingleton==null){

                    synchronized (lazySingleton.class){
                    if (lazySingleton==null){
                 lazySingleton =new lazySingleton();
             }
        }
        }
        return lazySingleton;
    }
}
