package sem5.task2;

public class MyRun implements Runnable{
    Thread t,t1;
    private int sec;
    MyRun(int sec) {
        this.sec = sec;
        // Главный поток
        t1=Thread.currentThread();
    }
    public void run() {
        // Дочерний поток
        t=Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            if (i%10==0)
            try{
                System.out.println(t.getName()+t.getState()+" "+i);
                //System.out.println(t1.getName()+t1.getState());
                Thread.sleep(sec);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}