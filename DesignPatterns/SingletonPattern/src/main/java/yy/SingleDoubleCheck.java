package yy;

public class SingleDoubleCheck {

    // 双检锁/双重校验锁（DCL，即 double-checked locking）
    // 用双锁机制，安全且在多线程情况下能保持高性能。

    // volatile：如果值发生了变更，其他线程立马可见，避免出现脏读的现象。保证了变量的可见性（visibility）。
    private volatile static SingleDoubleCheck instance;

    private SingleDoubleCheck(){};

    public static SingleDoubleCheck getInstance(){

        if (instance == null)
            synchronized (SingleDoubleCheck.class) {
            if (instance == null)
                instance = new SingleDoubleCheck();
        }
        return instance;
    }

}
