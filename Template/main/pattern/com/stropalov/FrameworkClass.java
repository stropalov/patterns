package pattern.com.stropalov;

/**
 * Created by andrey on 06.04.2015.
 */
public abstract class FrameworkClass {
    abstract void method();
    abstract void anotherMethod();

    public final void run(){
        method();
        anotherMethod();
    }
}
