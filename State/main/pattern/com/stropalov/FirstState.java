package pattern.com.stropalov;

/**
 * Created by andrey on 01.04.2015.
 */
public class FirstState implements State {
    @Override
    public void doWork(Context context) {
        System.out.println("In first state.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "FirstState{}";
    }
}
