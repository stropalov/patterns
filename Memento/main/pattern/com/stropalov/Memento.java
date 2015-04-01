package pattern.com.stropalov;

/**
 * Created by andrey on 01.04.2015.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
