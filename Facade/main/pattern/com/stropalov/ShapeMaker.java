package pattern.com.stropalov;

/**
 * Created by andrey on 06.04.2015.
 */
public class ShapeMaker {
    private ShapeFacade circle;
    private ShapeFacade rectangle;

    public ShapeMaker() {
        circle = new CircleF();
        rectangle = new RectangleF();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle() {
        rectangle.draw();
    }
}
