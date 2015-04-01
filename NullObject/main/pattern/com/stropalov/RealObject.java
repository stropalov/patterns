package pattern.com.stropalov;

/**
 * Created by andrey on 01.04.2015.
 */
public class RealObject extends AbstractObject{
    public RealObject(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
