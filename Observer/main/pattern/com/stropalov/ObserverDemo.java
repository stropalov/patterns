package pattern.com.stropalov;

/**
 * Created by andrey on 15.04.2015.
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 17");
        subject.setState(17);
        System.out.println("Second state change: 23");
        subject.setState(23);
    }
}
