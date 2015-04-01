package pattern.com.stropalov;

/**
 * Created by andrey on 01.04.2015.
 */
public class ObjectFactory {
    public static final String[] objects = {"Obj1", "Obj2", "Obj4"};

    public static AbstractObject getObject(String name){

        for(int i = 0; i < objects.length; i++){
            if(objects[i].equalsIgnoreCase(name)){
                return new RealObject(name);
            }
        }
        return new NullObject();
    }
}
