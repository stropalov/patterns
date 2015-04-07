package pattern.com.stropalov;

/**
 * Created by andrey on 07.04.2015.
 */
public class TurnOffCommand implements Command{
    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
         light.turnOff();
    }
}
