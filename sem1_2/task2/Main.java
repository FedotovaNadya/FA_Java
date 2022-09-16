package sem1_2.task2;

public class Main {

    public static void main(String[] args) {

        //Случайные вектора из стат метода
        Vector[] vectors = Vector.generator(10);
        for (int i = 0; i < vectors.length; i++) {
            vectors[i].value();
        }

        //
        Vector vector1 = new Vector(2, 5, 5);
        Vector vector2 = new Vector(10, 25, 2);
        System.out.println("\nВектор 1");
        vector1.value();
        System.out.println("\nВектор 2");
        vector2.value();

        System.out.println("\nДлина вектора 1: " + vector1.length());
        System.out.println("Длина вектора 2: " + vector2.length());
        System.out.println("Скалярное произведение вектора 1 и 2: " + vector1.DotProduct(vector2));
        System.out.println("Векторное произведение вектора 1 и 2:");
        vector1.CrossProduct(vector2).value();

        System.out.println("Угол между векторами 1 и 2: " + vector1.VectorCos(vector2));
        System.out.println("Сумма векторов 1 и 2");
        vector1.summ(vector2).value();
        System.out.println("Разность векторов 1 и 2");
        vector1.difference(vector2).value();

    }
}