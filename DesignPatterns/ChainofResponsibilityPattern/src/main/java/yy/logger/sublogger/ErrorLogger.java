package yy.logger.sublogger;

import yy.logger.AbstractLogger;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("ErrorLogger:" + message);
    }
}
