package pattern.com.stropalov;

/**
 * Created by andrey on 01.04.2015.
 */
public class NullObject extends AbstractObject{
    public NullObject() {
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "No object here";
    }
}
