package pattern.com.stropalov;

/**
 * Created by andrey on 10.04.2015.
 */
public class BuilderDemo {
    public static void main(String[] args){
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizza = new HawaiinianPizza();
        waiter.setPizzaBuilder(hawaiianPizza);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();

        System.out.println("New " +  pizza.getSize() + " pizza with " + pizza.getSauce() + " and " + pizza.getTopping());
    }
}
