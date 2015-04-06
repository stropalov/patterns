package pattern.com.stropalov;

/**
 * Created by andrey on 06.04.2015.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer e) {
       System.out.println("Visit computer");
    }

    @Override
    public void visit(Keyboard e) {
        System.out.println("Visit keyboard");
    }

    @Override
    public void visit(Mouse e) {
        System.out.println("Visit mouse");
    }
}
