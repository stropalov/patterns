package pattern.com.stropalov;

/**
 * Created by andrey on 05.04.2015.
 */
public class CompositeDemo {
    public static void main(String[] args){
        CompositeUser allUsers = new CompositeUser("All", "User", "London");
        CompositeUser firstUser = new CompositeUser("First", "User", "London");
        CompositeUser secondUser = new CompositeUser("Second", "User", "London");
        CompositeUser subSecondUser = new CompositeUser("SubSecond", "User", "London");
        CompositeUser subFirstUser = new CompositeUser("SubFirst", "User", "London");

        allUsers.add(firstUser);
        allUsers.add(secondUser);
        secondUser.add(subSecondUser);
        firstUser.add(subFirstUser);

        System.out.println(allUsers);
    }
}
