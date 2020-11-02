package yy.logger.sublogger;

import yy.logger.AbstractLogger;

public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level){
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("DebugLogger:" + message);
    }
}
