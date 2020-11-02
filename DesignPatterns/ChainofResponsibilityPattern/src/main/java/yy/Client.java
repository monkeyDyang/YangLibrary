package yy;

import yy.logger.*;

public class Client {
    public static void main(String[] args) {

        AbstractLogger logger = InitChainOfResponsibility.getChainOfResponsibility();

        logger.LogMessage(AbstractLogger.INFO,"this is INFO");
        System.out.println("-----------------------------------------");
        logger.LogMessage(AbstractLogger.DEBUG,"this is INFO");
        System.out.println("-----------------------------------------");
        logger.LogMessage(AbstractLogger.ERROR,"this is INFO");
        System.out.println("-----------------------------------------");
    }
}
