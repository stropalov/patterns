package pattern.com.stropalov;

/**
 * Created by andrey on 09.04.2015.
 */
public class AdapterDemo {
    public static void main (String[] s) {
        Target target = new Adapter();
        target.makeBreakfast();
        target.makeLunch();
        target.makeDinner();
    }
}
