package pattern.com.stropalov;

/**
 * Created by andrey on 01.04.2015.
 */
public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State_1");
        originator.setState("State_2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State_3");
        careTaker.add(originator.saveStateToMemento());

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
