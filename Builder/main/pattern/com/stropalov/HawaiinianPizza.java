package pattern.com.stropalov;

/**
 * Created by andrey on 10.04.2015.
 */
public class HawaiinianPizza extends PizzaBuilder{
    @Override
    public void buildSize() {
        pizza.setSize("big");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("mild");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pineapple");
    }
}
