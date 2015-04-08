package pattern.com.stropalov;

/**
 * Created by andrey on 08.04.2015.
 */
public class CircleFly implements ShapeI{
    private String color;
    private int x;
    private int y;
    private int radius;

    public CircleFly(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
         System.out.println("Draw " + color + " circle with radius = " + radius +
         " x = " + x + " y = " + y );
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
