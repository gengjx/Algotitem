package 设计模式.单例模式;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class lazySingleton {
    private static volatile lazySingleton lazySingleton =null;

    //双锁写法单例模式
    private lazySingleton getInstance(){
        if (lazySingleton==null){

                    synchronized (lazySingleton.class){
                    if (lazySingleton==null){
                 lazySingleton =new lazySingleton();
             }
        }
        }
        return lazySingleton;
    }



    private lazySingleton getInstance2(){

//        基础写法
        if (lazySingleton==null){
            lazySingleton =new lazySingleton();
        }
        return lazySingleton;
    }

    //加锁的懒汉单例模式
    private  lazySingleton getInstance3(){
        synchronized (getClass()){
            if (lazySingleton==null){
                lazySingleton=new lazySingleton();
            }
        }

        return lazySingleton;
    }

    //双重检查锁懒汉单例模式(没有加入volatile 关键字 会发生重排序导致类没有初始化完成导致返回为空)
    private lazySingleton getInsatnce4(){
        if (lazySingleton==null){
            synchronized (getClass()){
                if (lazySingleton==null){
                    lazySingleton=new lazySingleton();
                }

            }
        }
        return lazySingleton;
    }
}
