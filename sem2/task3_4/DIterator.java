package sem2.task3_4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DIterator implements Iterator<String>{
    private Iterator subIter;
    private DIterator newIter;

    public DIterator(Iterator iniIter) {
        this.subIter = iniIter;
    }

    @Override
    public boolean hasNext() {
        if (subIter.hasNext()) return true;
        if (newIter != null) return newIter.hasNext();
        return false;

    }

    @Override
    public String next() {
        if(!hasNext())
            throw new NoSuchElementException();

        Object obj = null;
        if (newIter != null && newIter.hasNext()) obj = newIter.next();

        if (subIter.hasNext() && obj == null) {
            obj = subIter.next();

            if (obj instanceof Iterator && ((Iterator) obj).hasNext()) {
                newIter = new DIterator((Iterator) obj);

            }
        }

        if(obj instanceof Iterator){
            obj = next();
        }

        return (String) obj;
}
}