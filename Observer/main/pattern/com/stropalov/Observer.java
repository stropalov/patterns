package pattern.com.stropalov;

/**
 * Created by andrey on 15.04.2015.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
