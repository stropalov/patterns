package pattern.com.stropalov;

/**
 * Created by andrey on 02.04.2015.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }   else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }   else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }

         return null;
    }
}
