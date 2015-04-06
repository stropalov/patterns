package pattern.com.stropalov;

/**
 * Created by andrey on 06.04.2015.
 */
public class VisitorDemo {
    public static void main(String[] args){
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
