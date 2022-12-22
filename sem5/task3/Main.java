package sem5.task3;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("a");
        PrintThread pr1 = new PrintThread(builder);
        PrintThread pr2 = new PrintThread(builder);
        PrintThread pr3 = new PrintThread(builder);
        
        pr1.start();
        pr2.start();
        pr3.start();
    }


}
