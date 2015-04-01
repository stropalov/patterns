package pattern.com.stropalov;

/**
 * Created by andrey on 01.04.2015.
 */
public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();

        FirstState firstState = new FirstState();
        firstState.doWork(context);
        System.out.println(context.getState().toString());

        SecondState secondState = new SecondState();
        secondState.doWork(context);
        System.out.println(context.getState().toString());
    }
}
