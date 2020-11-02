package yy;

public class SingleLogin {

    // 登记式，静态内部类
    // 能达到双检锁方式一样的功效，只适用于静态域使用延迟初始化的情况，双检锁方式可在实例域需要延迟初始化时使用。

    private static SingleLogin instance;

    // 通过一个内部静态类实例化，通过final修饰
    // 只有通过显示调用getInstance()时，才会显示装在SingleHolder
    private static class SingleHolder {
        private static final SingleLogin INSTANCE = new SingleLogin();
    }

    private SingleLogin(){};

    public static final SingleLogin getInstance(){
        return SingleHolder.INSTANCE;
    }

}
