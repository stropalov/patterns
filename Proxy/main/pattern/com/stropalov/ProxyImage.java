package pattern.com.stropalov;

/**
 * Created by andrey on 02.04.2015.
 */
public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
         if(realImage == null){
            realImage = new RealImage(filename);
         }
        realImage.display();
    }
}
