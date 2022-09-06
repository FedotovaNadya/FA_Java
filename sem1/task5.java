public class task5 {
    //Дано два числа a и b. Найдите гипотенузу треугольника с заданными катетами.
    public static void main(String[] args) {
        int a, b;
        double c;
        a=3;
        b=4;
        c= Math.sqrt(a*a+b*b);

        System.out.println("a="+a+" b=" +b);
        System.out.println("c="+c);
    }
}
