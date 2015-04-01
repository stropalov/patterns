package pattern.com.stropalov;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrey on 01.04.2015.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
