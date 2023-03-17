package sem4_kr.task2;

public class Ferrari extends Car{
    public Ferrari(int price) {
        super(340, 0, price);
        // 
    }

    int accelerateSpeed = 20;
    // @Override
    public void accelerate(int speed) {
        
        super.accelerate(speed+accelerateSpeed);
    }
}
