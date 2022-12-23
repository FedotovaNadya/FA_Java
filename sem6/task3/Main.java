package sem6.task3;

public class Main {
    public static double func(double x){
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    public static double  solve(double start, double end){
        double x = start + (end - start) / 2;
        if(x == end || x == start){
            return x;
        }

        if(func(start) * func(x) > 0){
            return solve(x, end);
        } else {
            return solve(start, x);
        }
    }

    public static void main(String[] args) {
        System.out.println(solve(0, 10)); 
    }
}
