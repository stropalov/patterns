package pattern.com.stropalov;

/**
 * Created by andrey on 06.04.2015.
 */
public class RectanglePr extends ShapePrototype {

    public RectanglePr() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Draw rectangle");
    }
}
