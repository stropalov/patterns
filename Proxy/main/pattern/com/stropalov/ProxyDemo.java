package pattern.com.stropalov;

/**
 * Created by andrey on 02.04.2015.
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("image.jpg");

        image.display();
        image.display();

    }
}
