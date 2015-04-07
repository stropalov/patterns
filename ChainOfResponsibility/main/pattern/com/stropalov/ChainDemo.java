package pattern.com.stropalov;

/**
 * Created by andrey on 07.04.2015.
 */
public class ChainDemo {
    public static void main(String[] args){
        AbstractLogger logger = new ConsoleLogger(AbstractLogger.CONSOLE);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.FILE);
        AbstractLogger mailLogger = new MailLogger(AbstractLogger.MAIL);

        logger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(mailLogger);

        logger.logMessage(AbstractLogger.CONSOLE, "message");
        System.out.println();
        logger.logMessage(AbstractLogger.FILE, "message");
        System.out.println();
        logger.logMessage(AbstractLogger.MAIL, "message");
    }
}
