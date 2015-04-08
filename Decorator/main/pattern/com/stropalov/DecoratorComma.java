package pattern.com.stropalov;

/**
 * Created by andrey on 08.04.2015.
 */
public class DecoratorComma extends Decorator{

    public DecoratorComma(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.print(",");
        super.doOperation();
    }

    @Override
    public void doNewOperation() {
        System.out.println("New comma operation");
    }
}

