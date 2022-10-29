package sem4_kr.task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("green", 100, "Auto", 0, 30000);
        Ferrari f1 = new Ferrari("red", 22310000);
        System.out.println(f1.getPrice());
    }
}
