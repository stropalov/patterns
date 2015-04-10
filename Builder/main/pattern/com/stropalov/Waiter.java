package pattern.com.stropalov;

/**
 * Created by andrey on 10.04.2015.
 */
public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }

    public void constructPizza(){
        pizzaBuilder.createPizza();
        pizzaBuilder.buildSize();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }

}
