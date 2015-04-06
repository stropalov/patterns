package pattern.com.stropalov;

/**
 * Created by andrey on 06.04.2015.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor e);
}
