package sem6.task2;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] arr = new int[100000000];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 1000);
        Arrays.sort(arr);

    }
    System.out.println("Поиск методом перебора...");
        long start = System.nanoTime();
        enumeration(arr, 60);
        long finish = System.nanoTime(); 
        System.out.println("Времени затрачено: " + (double) (finish - start));
        
        System.out.println("Поиск двоичным методом...");
        start = System.nanoTime();
        recursion(arr, 60, 0, arr.length);
        finish = System.nanoTime(); 
        System.out.println("Времени затрачено: " + (double) (finish - start));
    }

    public static int enumeration(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        System.out.println("Элемент не найден");
        return -1;
    }

    public static int recursion(int[] arr, int x , int i1, int i2) {
        
        // нахождение середины
        int middle = (i1 + i2) / 2;

        //предусматриваем выход из рекурсии, если нечего больше делить
        if (i2 <= i1) return -1; 

        if (arr[middle] == x) {
            return middle;

        } else if (arr[middle] > x) {
                // поиск по левой половине
                return recursion(arr, x, i1, middle - 1);
        } else {
            // поиск по правой половине
            return recursion(arr, x, middle + 1, i2);
        }
    }
    
}
