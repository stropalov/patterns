package pattern.com.stropalov;

/**
 * Created by andrey on 09.04.2015.
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void makeBreakfast() {
        getTea();
    }

    @Override
    public void makeLunch() {
        getMeat();
    }

    @Override
    public void makeDinner() {
        getSoup();
    }
}
