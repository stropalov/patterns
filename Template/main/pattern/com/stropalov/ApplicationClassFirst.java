package pattern.com.stropalov;

/**
 * Created by andrey on 06.04.2015.
 */
public class ApplicationClassFirst extends FrameworkClass{
    @Override
    void method() {
           System.out.println("Method in first class");
    }

    @Override
    void anotherMethod() {
        System.out.println("Another method in first class");
    }
}
