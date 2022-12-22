package sem5.task3;

public class PrintThread extends Thread{
    StringBuilder strBild;
    public PrintThread(StringBuilder strBild){
        this.strBild = strBild;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() +" " + i +": "+ strBild);
        }
        this.strBild.append('a');
    }
}
