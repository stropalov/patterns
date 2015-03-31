package pattern.com.stropalov;

/**
 * Created by andrey on 31.03.2015.
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton object = Singleton.getInstance();
        object.showMessage();
    }
}
