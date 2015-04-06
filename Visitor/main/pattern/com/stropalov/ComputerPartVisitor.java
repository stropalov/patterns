package pattern.com.stropalov;

/**
 * Created by andrey on 06.04.2015.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Keyboard keyboard);
    public void visit(Mouse mouse);
}
