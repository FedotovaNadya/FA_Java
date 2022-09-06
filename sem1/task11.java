public class task11 {
    //Реализуйте метод, в который передается две целочисленные переменные и возвращает их среднее геометрическое
    public static void main(String[] args) {
        System.out.println(geom_mean(1,1));
        System.out.println(geom_mean(2,4));
        System.out.println(geom_mean(-2,-4));
    }

    public static double geom_mean (int a, int b) {
        return Math.sqrt(a*b);
    }
}
