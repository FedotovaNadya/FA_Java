package sem3.task1;

public class Dish {
    private String name;
    private int price;
    private String measurement;
    private double quantity;
    private String [] composition;

    public Dish(String name, int price, String measurement, double quantity, String ... composition){
        this.name = name;
        this.price = price;
        this.measurement = measurement;
        this.quantity = quantity;
        this.composition = composition;
    }

    public String getAllInfo(){
        String s = this.name + " " + this.price +" "+this.measurement+" "+this.quantity;
        for (String str : composition) {
            s+= " "+ str;
        }
        return s;
    }
    public String getInfo(){
        return this.name + " " + this.price;
    }
    public String getName(){return this.name;}
    public int getPrice(){return this.price;}

}
