package pattern.com.stropalov;

/**
 * Created by andrey on 01.04.2015.
 */
public class SecondState implements State{
    @Override
    public void doWork(Context context) {
        System.out.println("In second state.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "SecondState{}";
    }

}
