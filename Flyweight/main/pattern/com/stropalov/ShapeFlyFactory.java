package pattern.com.stropalov;

import java.util.HashMap;

/**
 * Created by andrey on 08.04.2015.
 */
public class ShapeFlyFactory {
    private static final HashMap<String, ShapeI> circleMap = new HashMap<String, ShapeI>();

    public static ShapeI getCircle(String color){
        CircleFly circle = (CircleFly)circleMap.get(color);

        if(circle == null){
            circle = new CircleFly(color);
            circleMap.put(color, circle);
            System.out.println("Creating new " + color + " circle");
        }
        return circle;
    }
}
