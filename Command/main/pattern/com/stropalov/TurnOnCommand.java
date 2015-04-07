package pattern.com.stropalov;

/**
 * Created by andrey on 07.04.2015.
 */
public class TurnOnCommand implements Command{
    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

