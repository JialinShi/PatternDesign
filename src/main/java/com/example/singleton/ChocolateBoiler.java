package com.example.singleton;

/**线程安全的单例模式
 * 采用了双重检查锁+volatile确保线程安全
 * lazy load不会在类加载时创建，而是只有在第一次调用getInstance()时才初始化，节省内存*/

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    /** 单例实例，使用volatile关键字防止指令重排序*/
    private static volatile ChocolateBoiler uniqueBoiler;

    /** 私有构造方法，确保外部不能直接创建实例*/
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    /**双重检查锁，double checked locking实现线程安全的懒汉单例*/
    public static ChocolateBoiler getInstance(){
        if(uniqueBoiler == null){ // 第一次检查，提高性能
            synchronized (ChocolateBoiler.class){ // 同步，确保线程安全
                if(uniqueBoiler == null){ // 第二次检查，防止重复创建
                    uniqueBoiler = new ChocolateBoiler();
                }
            }
        }
        return uniqueBoiler;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }else{
            throw new IllegalArgumentException("Not empty. Cannot fill.");
        }
    }
    public void drain(){
        if(!isEmpty() && isBoiled()){
            // pour chocolate
            empty = true;
        }
    }
    public void boil(){
        if(!isEmpty() && !isBoiled()){
            // boiling
            boiled = true;
        }
    }
    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }


}
