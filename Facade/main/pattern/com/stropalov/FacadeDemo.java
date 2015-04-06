package pattern.com.stropalov;

/**
 * Created by andrey on 06.04.2015.
 */
public class FacadeDemo {
    public static void main(String[] args){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
