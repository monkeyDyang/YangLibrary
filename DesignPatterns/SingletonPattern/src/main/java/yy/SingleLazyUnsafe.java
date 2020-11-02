package yy;

public class SingleLazyUnsafe {

    // 懒汉式，线程不安全
    // 不支持多线程，没有使用synchronized加锁
    // 第一次调用时才会初始化

    private static SingleLazyUnsafe instance;

    private SingleLazyUnsafe(){};

    public static SingleLazyUnsafe getInstance(){

        if (instance == null)
            instance = new SingleLazyUnsafe();

        return instance;
    }

}
