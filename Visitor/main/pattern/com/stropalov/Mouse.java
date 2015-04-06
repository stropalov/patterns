package pattern.com.stropalov;

/**
 * Created by andrey on 06.04.2015.
 */
public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
