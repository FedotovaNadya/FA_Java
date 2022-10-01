package sem2.task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleIterator<T> implements Iterator<T>  {
    private Iterator<T> iter1;
    private Iterator<T> iter2;
    
    public DoubleIterator(Iterator<T> innerIterator1, Iterator<T> innerIterator2){
        this.iter1 = innerIterator1;
        this.iter2 = innerIterator2;
    }

    @Override
    public boolean hasNext() {
        return (iter1.hasNext()||iter2.hasNext());
    }
    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();

        while (iter1.hasNext()) return iter1.next();
        while (iter2.hasNext()) return iter2.next();
        return null;
    }
}
