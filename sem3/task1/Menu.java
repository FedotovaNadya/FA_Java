package sem3.task1;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> dishList = new ArrayList<>();
    private ArrayList<Dish> stopList = new ArrayList<>();

    public Menu(Dish ... dishs){
        for (Dish dish : dishs) {
            dishList.add(dish);
        }
    }

    public ArrayList<Dish> getStopList(){
        return this.stopList;
    }

    public void printActualMenu(){
        for (int i = 0; i < dishList.size(); i++) {
            Dish dish = dishList.get(i);
            if (stopList.indexOf(dish)<0)
            System.out.println(dish.getName());
        }
    }
    public void printAllMenu(){
        for (int i = 0; i < dishList.size(); i++) {
            Dish dish = dishList.get(i);
            System.out.println(dish.getName());
        }
    }

    public Dish getDish(int id){
        return dishList.get(id);
    }

    public void addDish(Dish dish){
        this.dishList.add(dish);
    }
    public void addDishInStopList(Dish dish){
        this.stopList.add(dish);
    }
    public void delDish(Dish dish){
        this.dishList.remove(dish);
    }

    public void delDishFromStopList(Dish dish){
        this.stopList.remove(dish);
    }
}
