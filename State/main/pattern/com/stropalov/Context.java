package pattern.com.stropalov;

/**
 * Created by andrey on 01.04.2015.
 */
public class Context {
    private State state;


    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
