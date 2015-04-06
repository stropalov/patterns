package pattern.com.stropalov;

import java.util.Hashtable;

/**
 * Created by andrey on 06.04.2015.
 */
public class ShapeCache {
    private static Hashtable<String, ShapePrototype> shapeMap = new Hashtable<String, ShapePrototype>();

    public static ShapePrototype getShape(String shapeId) {
        ShapePrototype cachedShape = shapeMap.get(shapeId);
        return (ShapePrototype) cachedShape.clone();
    }

    public static void loadCache() {
        CirclePr circle = new CirclePr();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        RectanglePr rectangle = new RectanglePr();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
