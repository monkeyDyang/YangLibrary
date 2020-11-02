package yy.logger.sublogger;

import yy.logger.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {

    // 设置级别
    public ConsoleLogger(int level){
        this.level = level;
    }

    // 重写打印方法
    protected void write(String message) {
        System.out.println("ConsoleLogger:" + message);
    }
}
