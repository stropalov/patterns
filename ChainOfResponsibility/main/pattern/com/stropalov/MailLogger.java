package pattern.com.stropalov;

/**
 * Created by andrey on 07.04.2015.
 */
public class MailLogger extends AbstractLogger{
    public MailLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Mail: " + message);
    }


}
