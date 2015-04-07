package pattern.com.stropalov;

/**
 * Created by andrey on 07.04.2015.
 */
public class CommandDemo {
    public static void main(String[] args) {
        Light light = new Light();

        Command turnOn = new TurnOnCommand(light);
        Command turnOff = new TurnOnCommand(light);

        Switch switcher = new Switch(turnOn, turnOff);

        switcher.switchOn();
        switcher.switchOff();
    }
}
