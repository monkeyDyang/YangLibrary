package yy.logger;

public abstract class AbstractLogger {
    public final static int INFO = 1;
    public final static int DEBUG = 2;
    public final static int ERROR = 3;

    // 每个处理者的等级
    protected int level;

    // 职责链中的下一处理者
    private AbstractLogger nextLogger;

    // 设置下一个处理者
    public void setNextAbstractLogger(AbstractLogger nextAbstractLogger){
        this.nextLogger = nextAbstractLogger;
    }

    public final void LogMessage(int level,String Message){

        // 属于当前级别，打印Message
        if (this.level == level)
            write(Message);

        // 不属于当前级别，将信息传递给下一级别
        if (nextLogger != null)
            nextLogger.LogMessage(level,Message);
    }

    // 处理的事务
    abstract protected void write(String message);
}
