package sem3.task1;

import java.util.ArrayList;

public class Table {
    private String tableName;
    private boolean occupied = false;
    private ArrayList<Ordering> orderList = new ArrayList<>();

    public Table(String name){
        this.tableName = name;
    }

    public boolean getOccupied(){
        return this.occupied;
    }

    public String getTableName(){
        return this.tableName;
    }

    public Ordering getOrdering(){
        return this.orderList.get(this.orderList.size());
    }

    public Ordering newOrder(){
        this.occupied = true;
        Ordering o = new Ordering(this.tableName);
        orderList.add(o);
        return o;
    }
}

