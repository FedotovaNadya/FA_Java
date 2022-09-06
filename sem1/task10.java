public class task10 {
    //Реализуйте метод, в который передается две целочисленные переменные и возвращает их среднее арифметическое
    public static void main(String[] args) {
        System.out.println(arith_mean(10,40));
        System.out.println(arith_mean(-10, -40));
        System.out.println(arith_mean(-10,40));
        System.out.println(arith_mean(10,0));
    }

    public static double arith_mean(int a, int b){
        return (a+b)/2.0;
    }
}
