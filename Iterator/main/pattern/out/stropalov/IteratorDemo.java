package pattern.out.stropalov;

/**
 * Created by andrey on 03.04.2015.
 */
public class IteratorDemo {
    public static void main(String[] args){
        NameRepository nameRepository = new NameRepository();

        for(Iterator it = nameRepository.getIterator(); it.hasNext(); ){
            String name = (String)it.next();
            System.out.println("Name: " + name);
        }
    }
}
