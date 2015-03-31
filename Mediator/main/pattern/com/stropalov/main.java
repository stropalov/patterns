package pattern.com.stropalov;

/**
 * Created by andrey on 31.03.2015.
 */
public class main {
    public static void main(String[] args) {
        User john = new User("John");
        User bob = new User("Bob");

        john.sendMessage("Hello, Bob.");
        bob.sendMessage("Hello, John.");
    }
}
