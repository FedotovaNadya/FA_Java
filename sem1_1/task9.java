//Реализуйте метод, который получает целое число на вход и возвращает разницу между данным числом и 21. Выведите значение на экран с различными целыми числами

public class task9 {
    public static void main(String[] args) {

        System.out.println(dif21(121));
        System.out.println(dif21(21));
        System.out.println(dif21(-10));
    }
    public static int dif21(int n){
        return n-21;
    }
}
