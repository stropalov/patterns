package pattern.com.stropalov;

/**
 * Created by andrey on 07.04.2015.
 */
public abstract class AbstractLogger {
    public static int CONSOLE = 1;
    public static int FILE = 2;
    public static int MAIL = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if (nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected  void write(String message);
}
