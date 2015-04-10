package pattern.com.stropalov;

/**
 * Created by andrey on 10.04.2015.
 */
public class Pizza {
    private String size = "";
    private String sauce = "";
    private String topping = "";

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getSauce() {
        return sauce;
    }

    public String getSize() {
        return size;
    }

    public String getTopping() {
        return topping;
    }
}
