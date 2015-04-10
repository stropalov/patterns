package pattern.com.stropalov;

/**
 * Created by andrey on 10.04.2015.
 */
public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createPizza(){
        pizza = new Pizza();
    }

    public abstract void buildSize();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
