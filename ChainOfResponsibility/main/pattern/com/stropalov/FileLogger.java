package pattern.com.stropalov;

/**
 * Created by andrey on 07.04.2015.
 */
public class FileLogger extends AbstractLogger{
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File: " + message);
    }
}

