package pattern.com.stropalov;

/**
 * Created by andrey on 04.04.2015.
 */
public abstract class ShapeBridge {
    protected DrawApi drawApi;

    protected ShapeBridge(DrawApi drawApi){
        this.drawApi = drawApi;
    }
    public  abstract void draw();
}
