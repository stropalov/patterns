package pattern.com.stropalov;

/**
 * Created by andrey on 06.04.2015.
 */
public class TemplateDemo {
    public static void main(String[] args) {
        FrameworkClass frameworkClass = new ApplicationClassFirst();
        frameworkClass.run();

        frameworkClass = new ApplicationClassSecond();
        frameworkClass.run();
    }
}
