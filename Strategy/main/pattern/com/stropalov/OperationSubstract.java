package pattern.com.stropalov;

/**
 * Created by andrey on 02.04.2015.
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int n, int m) {
        return n - m;
    }
}
