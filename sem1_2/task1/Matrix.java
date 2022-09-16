package sem1_2.task1;
/*
1)	Реализуйте класс матрицы и методы
    a.	Сложение и вычитание матриц.
    b.	Умножение матрицы на число.
    c.	Произведение двух матриц.
    d.	Транспонированная матрица.
    e.	Возведение матрицы в степень.
    f.	Если метод, возвращает матрицу, то он должен возвращать новый объект, а не менять базовый.
 */
import java.util.Random;

/*
 * Класс матрицы
 */

public class Matrix {

    int n;
    int m;
    double[][] thisMatrix;

    // Конструктор
    public Matrix(int n, int m) {
        this.thisMatrix = new double[n][m];
        this.n = n;
        this.m = m;
        this.initiliser();
    }

    // Констуктор при передаче готовой матрицы
    public Matrix(double[][] thisMatrix) {
        this.thisMatrix = thisMatrix;
        this.n = thisMatrix.length;
        this.m = thisMatrix[0].length;
    }

    // Инициализация матрицы
    private void initiliser() {
        Random random = new Random();
        for (int i = 0; i < thisMatrix.length; i++) {
            for (int j = 0; j < thisMatrix[i].length; j++) {
                thisMatrix[i][j] = random.nextInt(100);
            }
        }
    }

    // Вывод матрицы на экран
    public void getvalue() {
        for (int i = 0; i < thisMatrix.length; i++) {
            for (int j = 0; j < thisMatrix[i].length; j++) {
                System.out.printf("%.2f  ", thisMatrix[i][j]);
            }
            System.out.print("\n");
        }
    }

    // Умножение матрицы на число
    public Matrix numberMultiplication(double inputNumber) {
        double[][] resultMatrix = new double[this.n][this.m];

        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                double result = this.thisMatrix[i][j] * inputNumber;
                resultMatrix[i][j] = result;
            }
        }
        return new Matrix(resultMatrix);
    }

    // Вычисление транспонированной матрицы
    public Matrix transpose() {

        double[][] resultMatrix = new double[this.m][this.n];
        for (int i = 0; i < this.n; i++)
            for (int j = 0; j < this.m; j++)
                resultMatrix[j][i] = thisMatrix[i][j];
        return new Matrix(resultMatrix);
    }

    // Возведение в степень
    public Matrix exponentiation(int N) {

        if (this.n != this.m) {
            System.out.println("Необходима квадратная матрица для ее возведения в степень!");
            return null;
        }

        Matrix newMatrix = this;
        Matrix currentMatrix = this;

        int currentN = 1;
        while (currentN < N) {
            MatrixExecuter obj = new MatrixExecuter(newMatrix, currentMatrix);
            newMatrix = obj.composition();
            currentN++;
        }
        return newMatrix;
    }
}

/*
 * Операции с несколькими матрицами
 */
class MatrixExecuter {

    Matrix matrix1;
    Matrix matrix2;

    public MatrixExecuter(Matrix obj1, Matrix obj2) {
        this.matrix1 = obj1;
        this.matrix2 = obj2;
    }

    // Произведение
    public Matrix composition() {

        if (matrix1.m != matrix2.n) {
            System.out.println("Кол-во столбцов матрицы не равно кол-ву строк");
            return null;
        }
        double[][] resultMatrix = new double[matrix1.n][matrix2.m];

        for (int i = 0; i < matrix1.n; i++) {
            for (int j = 0; j < matrix2.m; j++) {
                for (int k = 0; k < matrix1.m; k++) {
                    resultMatrix[i][j] += matrix1.thisMatrix[i][k] * matrix2.thisMatrix[k][j];
                }
            }
        }
        return new Matrix(resultMatrix);
    }

    // Сумма
    public Matrix summ() {
        if ((matrix1.n != matrix2.n) || (matrix1.m != matrix2.m)) {
            System.out.println("Неправильная размерность матрицы");
            return null;
        } else {

            double[][] resultMatrix = new double[matrix1.n][matrix1.m];

            for (int i = 0; i < matrix1.n; i++) {
                for (int j = 0; j < matrix1.m; j++) {
                    double result = matrix1.thisMatrix[i][j] + matrix2.thisMatrix[i][j];
                    resultMatrix[i][j] = result;
                }
            }
            return new Matrix(resultMatrix);
        }
    }

    // Разность
    public Matrix difference() {
        if ((matrix1.n != matrix2.n) || (matrix1.m != matrix2.m)) {
            System.out.println("Неправильная размерность матрицы");
            return null;
        } else {

            double[][] resultMatrix = new double[matrix1.n][matrix1.m];

            for (int i = 0; i < matrix1.n; i++) {
                for (int j = 0; j < matrix1.m; j++) {
                    double result = matrix1.thisMatrix[i][j] - matrix2.thisMatrix[i][j];
                    resultMatrix[i][j] = result;
                }
            }

            return new Matrix(resultMatrix);
        }
    }
}

