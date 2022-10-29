package sem4_kr.task2;

public class Car {
    private String color;
    private int maxSpeed;
    private String transmissionType;
    private int speed;
    private int price;

    public Car(String color,int maxSpeed,String transmissionType,int speed,int price){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmissionType = transmissionType;
        this.speed = speed;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int newPrice){
         this.price = newPrice;
    }

    public void accelerate(int speed){
        if (this.speed+speed <= this.maxSpeed){
            this.speed+=speed;
        }
        else{
            this.speed = this.maxSpeed;
        }
    }
    public void start(){}

    public void stop(){
        this.speed = 0;
    }
}
