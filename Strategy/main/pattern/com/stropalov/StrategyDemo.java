package pattern.com.stropalov;

/**
 * Created by andrey on 02.04.2015.
 */
public class StrategyDemo {
    public static void main(String[] args) {
        StrategyContext context = new StrategyContext(new OperationAdd());
        System.out.println("3 + 3 = " + context.chooseStrategy(3, 3));

        context = new StrategyContext(new OperationSubstract());
        System.out.println("12 - 6 = " + context.chooseStrategy(12, 6));

        context = new StrategyContext(new OperationMultiply());
        System.out.println("2 * 2 = " + context.chooseStrategy(2, 2));
    }
}
