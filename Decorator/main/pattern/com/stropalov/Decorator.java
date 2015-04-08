package pattern.com.stropalov;

/**
 * Created by andrey on 08.04.2015.
 */
public abstract class Decorator implements Component{
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void doOperation() {
        component.doOperation();
    }

    public void doNewOperation() {
        System.out.println("Do New Operation");
    }
}