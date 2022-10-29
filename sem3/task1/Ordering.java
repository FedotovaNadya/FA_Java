package sem3.task1;

import java.util.ArrayList;

public class Ordering {
    // Заказ
    String table;
    double sum = 0;
    private ArrayList<Dish> dishList = new ArrayList<>();
    private ArrayList<Dish> dishServedList = new ArrayList<>();

    public Ordering(String table) {
        this.table = table;
    }

    public void printInfo(){
        System.out.println(this.table);
        System.out.println(this.sum);

        for (int i=0; i< dishList.size(); i++){
            Dish d = dishList.get(i);
            String s = d.getInfo();
            if (dishServedList.indexOf(d)>=0) s+= " Served ";
            System.out.println(s);
        }
    } 

    public double getfinalSum() {
        this.sum = 0;
        for (Dish dish : dishList) {
            this.sum += dish.getPrice();
        }
        return this.sum;
    }

    public void addServed(Dish... dishs) {
        for (Dish dish : dishs) {
            this.dishServedList.add(dish);
        }
    }

    public void addDishs(Dish ... dishs) {
        for (Dish dish : dishs) {
            this.dishList.add(dish);
        }
    }

    public String finalOrdering() {
        if (dishList.size() == dishServedList.size()) {
            String rez = "Заказ закрыт. Сумма заказа " + this.getfinalSum();
            return rez;

        }
        return "Заказ не может быть закрыт, не все блюда поданы";
    }

    
}
