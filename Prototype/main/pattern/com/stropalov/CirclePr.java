package pattern.com.stropalov;

/**
 * Created by andrey on 06.04.2015.
 */
public class CirclePr extends ShapePrototype{

    public CirclePr() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Draw circle");
    }
}
