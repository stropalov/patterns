package pattern.com.stropalov;

/**
 * Created by andrey on 16.04.2015.
 */
public class ContextInterpreter {
    private String input;
    private String output;

    public ContextInterpreter(String input) {
        this.input = input;
        this.output = "";
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
