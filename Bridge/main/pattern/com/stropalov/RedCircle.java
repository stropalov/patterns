package pattern.com.stropalov;

/**
 * Created by andrey on 04.04.2015.
 */
public class RedCircle implements DrawApi{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw red circle: rad = " + radius + ", x = " + x + ", y = " + y);
    }
}
