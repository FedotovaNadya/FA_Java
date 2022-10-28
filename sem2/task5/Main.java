package sem2.task5;

import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection); 
    }
}
