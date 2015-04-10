package pattern.com.stropalov;

/**
 * Created by andrey on 10.04.2015.
 */
public class SpicyPizza extends PizzaBuilder{
    @Override
    public void buildSize() {
        pizza.setSize("little");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("hot");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni");
    }
}