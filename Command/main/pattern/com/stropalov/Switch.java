package pattern.com.stropalov;

/**
 * Created by andrey on 07.04.2015.
 */
public class Switch {
    private Command switchOnCommand;
    private Command switchOffCommand;

    public Switch( Command switchOnCommand, Command switchOffCommand) {
        this.switchOnCommand = switchOnCommand;
        this.switchOffCommand = switchOffCommand;
    }

    public void switchOn() {
       switchOnCommand.execute();
    }

    public void switchOff() {
        switchOffCommand.execute();
    }
}
