package yy.logger;

import yy.logger.sublogger.ConsoleLogger;
import yy.logger.sublogger.DebugLogger;
import yy.logger.sublogger.ErrorLogger;

/* 初始化职责链 */
public class InitChainOfResponsibility {

    public static AbstractLogger getChainOfResponsibility(){

        // 初始化职责链
        AbstractLogger logger1 = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger logger2 = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger logger3 = new ErrorLogger(AbstractLogger.ERROR);

        // 构建职责链关系
        logger1.setNextAbstractLogger(logger2);
        logger2.setNextAbstractLogger(logger3);

        return logger1;
    }
}
