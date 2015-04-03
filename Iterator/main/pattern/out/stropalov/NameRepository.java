package pattern.out.stropalov;

/**
 * Created by andrey on 03.04.2015.
 */
public class NameRepository implements Container{
    public String names[] = {"John", "Bob", "Jack"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
           if(index < names.length){
               return true;
           }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
