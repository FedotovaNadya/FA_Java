package sem5.task2;

public class Main {
    public static void main(String[] args) {
        // MyRun myrun = new MyRun(250);
        Thread t = new Thread(new MyRun(250));
        Thread t1 = new Thread(new MyRun(250));
        Thread t2 = new Thread(new MyRun(250));
        t.start();
        t1.start();
        t2.start();
        
    }
}
