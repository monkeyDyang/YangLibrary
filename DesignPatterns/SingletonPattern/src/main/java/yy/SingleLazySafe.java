package yy;

public class SingleLazySafe {

    // 懒汉式，线程安全
    // 第一次调用时才会初始化
    // 加锁会影响效率

    private static SingleLazySafe instance;

    private SingleLazySafe(){};

    public static synchronized SingleLazySafe getInstance(){

        if (instance == null)
            instance = new SingleLazySafe();

        return instance;

    }

}
