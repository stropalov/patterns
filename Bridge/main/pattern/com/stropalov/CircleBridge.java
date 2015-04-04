package pattern.com.stropalov;

/**
 * Created by andrey on 04.04.2015.
 */
public class CircleBridge extends ShapeBridge{
    private int x, y, radius;

    public CircleBridge(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
       drawApi.drawCircle(radius, x, y);
    }
}
