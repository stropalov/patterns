package pattern.com.stropalov;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrey on 05.04.2015.
 */
public class CompositeUser {
    private String name;
    private String surname;
    private String addr;
    private List<CompositeUser> users;


    public CompositeUser(String name, String addr, String surname) {
        this.name = name;
        this.addr = addr;
        this.surname = surname;
        users = new ArrayList<CompositeUser>();
    }

    public void add(CompositeUser user){
        users.add(user);
    }

    public void remove(CompositeUser user){
        users.remove(user);
    }

    public List<CompositeUser> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "CompositeUser{" +
                "addr='" + addr + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", users=" + users +
                '}';
    }
}
