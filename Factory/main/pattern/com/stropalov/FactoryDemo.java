package pattern.com.stropalov;

/**
 * Created by andrey on 02.04.2015.
 */
public class FactoryDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circleShape = shapeFactory.getShape("circle");
        circleShape.draw();

        Shape squareShape = shapeFactory.getShape("square");
        squareShape.draw();

        Shape rectangleShape = shapeFactory.getShape("rectangle");
        rectangleShape.draw();
    }
}
