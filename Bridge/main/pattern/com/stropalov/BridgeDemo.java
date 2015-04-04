package pattern.com.stropalov;

/**
 * Created by andrey on 04.04.2015.
 */
public class BridgeDemo {
    public static void main(String[] args){
        ShapeBridge redCircle = new CircleBridge(200, 200, 10, new RedCircle());
        ShapeBridge blueCircle = new CircleBridge(240, 210, 20, new BlueCircle());

        redCircle.draw();
        blueCircle.draw();
    }
}
