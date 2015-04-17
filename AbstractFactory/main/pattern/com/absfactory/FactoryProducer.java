package pattern.com.absfactory;

/**
 * Created by andrey on 17.04.2015.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (factory.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}
