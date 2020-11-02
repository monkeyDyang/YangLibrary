package yy;

public class SingleHungry {
    // 饿汉式
    //  优点：没有加锁，执行效率高
    //  缺点：类加载时初始化，浪费内存

    private static SingleHungry instance = new SingleHungry();

    private SingleHungry(){};

    public static SingleHungry getInstance(){

        return instance;
    }

}
