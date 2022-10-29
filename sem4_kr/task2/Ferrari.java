package sem4_kr.task2;

public class Ferrari extends Car{
    public Ferrari(String color, int price) {
        super(color, 340, "seven-speed dual-clutch", 0, price);
        //TODO Auto-generated constructor stub
    }

    int accelerateSpeed = 20;
    @Override
    public void accelerate(int speed) {
        // TODO Auto-generated method stub
        super.accelerate(speed+accelerateSpeed);
    }
}
