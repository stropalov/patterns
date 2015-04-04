package pattern.com.stropalov;

/**
 * Created by andrey on 04.04.2015.
 */
public class BlueCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw blue circle: rad = " + radius + ", x = " + x + ", y = " + y);
    }
}
