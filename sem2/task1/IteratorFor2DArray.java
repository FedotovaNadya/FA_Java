package sem2.task1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorFor2DArray implements  Iterator<Integer> {

    private int i, j;
    private int[][] data;

    public IteratorFor2DArray(int[][] data){
        this.data = data;
    }

    public boolean hasNext(){
        return (i < data.length && j < data[i].length);
    }
    public Integer next(){
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int element = data[i][j];
        j++;
        while (i < data.length && j >= data[i].length) {
            j = 0;
            i++;
        }
        return element;
    }
}
