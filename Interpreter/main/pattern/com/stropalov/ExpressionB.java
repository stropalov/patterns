package pattern.com.stropalov;

/**
 * Created by andrey on 16.04.2015.
 */
public class ExpressionB extends Expression {
    @Override
    public void interpret(ContextInterpreter context) {
        System.out.println("b expression");
        String input = context.getInput();

        context.setInput(input.substring(1));
        context.setOutput(context.getOutput()+ "2");
    }
}
