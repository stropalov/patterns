package pattern.com.stropalov;

/**
 * Created by andrey on 02.04.2015.
 */
public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int chooseStrategy(int n, int m){
        return strategy.doOperation(n, m);
    }
}
