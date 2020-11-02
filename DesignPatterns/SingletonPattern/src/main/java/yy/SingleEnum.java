package yy;

public enum SingleEnum {

    // 枚举
    // 这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。

    INSTANCE;
    public void whateverMethod() {
    }
}
