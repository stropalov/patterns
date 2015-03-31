package pattern.com.stropalov;

import java.util.Date;
/**
 * Created by andrey on 31.03.2015.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}