package pattern.com.stropalov;

/**
 * Created by andrey on 01.04.2015.
 */
public class NullObjectDemo {
    public static void main(String[] args) {
        AbstractObject obj1 = ObjectFactory.getObject("Obj1");
        AbstractObject obj2 = ObjectFactory.getObject("Obj2");
        AbstractObject obj3 = ObjectFactory.getObject("Obj3");
        AbstractObject obj4 = ObjectFactory.getObject("Obj4");

        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
        System.out.println(obj3.getName());
        System.out.println(obj4.getName());
    }
}
