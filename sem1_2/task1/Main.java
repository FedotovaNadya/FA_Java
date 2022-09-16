package sem1_2.task1;

public class Main {

    public static void main(String[] args) {

        Matrix obj1 = new Matrix(3, 5);
        Matrix obj2 = new Matrix(3, 5);
        System.out.println("Матрица А:");
        obj1.getvalue();
        System.out.println("\nМатрица B:");
        obj2.getvalue();

        System.out.println("\nТранспонированная матрца A:");
        Matrix transposed_obj1 = obj1.transpose();
        transposed_obj1.getvalue();
        System.out.println("\nТранспонированная матрца B:");
        Matrix transposed_obj2 = obj2.transpose();
        transposed_obj2.getvalue();

        double multiNumber = 4.2;
        System.out.println("\nУмножение матрицы А на число " + multiNumber);
        Matrix result = obj1.numberMultiplication(multiNumber);
        if (result != null)
            result.getvalue();

        // Сумма матриц
        MatrixExecuter executerObj = new MatrixExecuter(obj1, obj2);
        System.out.println("\nСумма:");
        result = executerObj.summ();
        if (result != null)
            result.getvalue();

        // Разность
        System.out.println("\nРазность:");
        result = executerObj.difference();
        if (result != null)
            result.getvalue();

        // Другая размерность матриц для произведения
        Matrix obj3 = new Matrix(2, 3);
        Matrix obj4 = new Matrix(3, 2);
        System.out.println("\nМатрица C:");
        obj3.getvalue();
        System.out.println("\nМатрица D:");
        obj4.getvalue();
        executerObj = new MatrixExecuter(obj3, obj4);
        System.out.println("\nПроизведение C*D:");
        result = executerObj.composition();
        if (result != null)
            result.getvalue();

        // Возведение квадратной матрицы в степень
        int N = 3;
        Matrix obj5 = new Matrix(2, 2);
        System.out.println("\nМатрица E:");
        obj5.getvalue();
        System.out.println("\nМатрица E в степени " + N);
        result = obj5.exponentiation(N);
        if (result != null)
            result.getvalue();

    }
}