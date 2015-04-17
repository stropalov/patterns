package pattern.com.absfactory;

/**
 * Created by andrey on 17.04.2015.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape sh1 = shapeFactory.getShape("CIRCLE");
        sh1.draw();

        Shape sh2 = shapeFactory.getShape("SQUARE");
        sh2.draw();

        Shape sh3 = shapeFactory.getShape("RECTANGLE");
        sh3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();
    }
}
