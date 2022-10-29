package sem4_kr.task2;

import java.util.Comparator;

class SortByPrice implements Comparator<Car> {
    public int compare(Car a, Car b) {
        if ( a.getPrice() < b.getPrice() ) return -1;
        else if ( a.getPrice() == b.getPrice() ) return 0;
        else return 1;
    }
}