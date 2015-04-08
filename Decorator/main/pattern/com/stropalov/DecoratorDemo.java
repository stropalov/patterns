package pattern.com.stropalov;

/**
 * Created by andrey on 08.04.2015.
 */
public class DecoratorDemo {
    public static void main (String... s) {
        Decorator c = new DecoratorComma(new DecoratorSpace(new MainComponent()));
        c.doOperation();
        c.doNewOperation();
    }
}
