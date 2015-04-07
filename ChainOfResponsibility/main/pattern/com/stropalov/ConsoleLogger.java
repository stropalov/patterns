package pattern.com.stropalov;

/**
 * Created by andrey on 07.04.2015.
 */
public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console: " + message);
    }


}
