package com.example.singleton;

public class Singleton {
    private static Singleton uniqueSingleton;

    private Singleton(){};
    /** 方法一： synchronized 迫使这个方法必须执行完，别的线程才能进入
     * 也就是说，没有两个线程可以同时进入该方法
     *
     * 但是同步导致性能开销大，只有第一次执行方法才需要和同步扯上关系，
     * 第一次之后，同步完全是浪费*/
    public static synchronized Singleton getInstance(){
        if(uniqueSingleton == null){
            uniqueSingleton = new Singleton();
        }
        return uniqueSingleton;
    }

    /**方法二：急切创建实力，而不是延迟创建
     * 在静态初始化中创建单肩实力，这保证是线程安全的
     * 一开始就有了一个实例，后面直接返回即可
     *
     * 如果资源密集，急切创建增加开销*/
    private static Singleton uniqueSingleton2 = new Singleton();

    public static Singleton getInstance2(){
        return  uniqueSingleton2;
    }

    /**方法三：Double-checked Locking
     * volatile防止指令重排序，确保uniqueSingleton3 = new Singleton()一定是先分配内存，再初始化，再复制
     * 保证可见行，确保多线程都能看到最新的uniqueSingleton3
     *
     * synchronized:确保同一时刻只有一个线程进入synchronized代码块，防止多个线程同时创建实例
     * volatile： 防止指令冲排序，确保对象创建的可见性和完整性，防止获取未完全初始化的对象
     * 两者一起用，才能确保线程安全的懒汉单例
     *
     * 但是可能会有反射攻击，反序列化安全问题，代码也并不简洁*/
    private volatile static Singleton uniqueSingleton3;

    public static Singleton getInstance3(){
        if(uniqueSingleton3 == null){
            synchronized (Singleton.class){
                if(uniqueSingleton3 == null) {
                    uniqueSingleton3 = new Singleton();
                }
            }
        }
        return uniqueSingleton3;
    }

    /**方法四：优选单例实现
     * enum的本质是一个特殊的类，由JVM保证它是全局唯一的
     * 自动线程安全，只会被创建一次，不需要synchronized
     * 防止反序列化和反射攻击
     *
     * volatile+synchronized 是线程安全的，但不保证反序列化安全和反射安全
     * */
    public enum SingletonInstance{
        UNIQUE_INSTANCE;
    }
    public class SingletonClient{
        public static void main(String[] args) {
            SingletonInstance singleton4 = SingletonInstance.UNIQUE_INSTANCE;
        }
    }



}
