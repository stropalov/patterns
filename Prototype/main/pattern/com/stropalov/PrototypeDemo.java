package pattern.com.stropalov;

/**
 * Created by andrey on 06.04.2015.
 */
public class PrototypeDemo {
    public static void main(String[] args){
        ShapeCache.loadCache();

        ShapePrototype clonedShape1 = (ShapePrototype)ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape1.getType());

        ShapePrototype clonedShape2 = (ShapePrototype)ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());
    }
}
