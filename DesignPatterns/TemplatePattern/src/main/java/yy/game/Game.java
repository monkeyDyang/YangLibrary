package yy.game;

public abstract class Game {

    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();

    // 模板,final防止被重写
    public final void play(){
        // 初始化
        initialize();
        // 开始
        startPlay();
        // 结束
        endPlay();
    }
}
