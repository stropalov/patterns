package pattern.com.absfactory;

/**
 * Created by andrey on 17.04.2015.
 */
public abstract class AbstractFactory {
        abstract Color getColor(String color);
        abstract Shape getShape(String shape);
}
