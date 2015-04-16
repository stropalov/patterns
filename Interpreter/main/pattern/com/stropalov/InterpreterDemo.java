package pattern.com.stropalov;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrey on 16.04.2015.
 */
public class InterpreterDemo {
    public static void main(String[] args) {
        String str = "st";
        ContextInterpreter context = new ContextInterpreter(str);

        List<Expression> list = new ArrayList<Expression>();
        list.add(new ExpressionA());
        list.add(new ExpressionB());

        for(Expression ex : list)
            ex.interpret(context);

        System.out.println(context.getOutput());
    }
}
