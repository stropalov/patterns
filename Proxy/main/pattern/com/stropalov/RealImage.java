package pattern.com.stropalov;

/**
 * Created by andrey on 02.04.2015.
 */
public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Load file " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Image " + fileName);
    }
}
