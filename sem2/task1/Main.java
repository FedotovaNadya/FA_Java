package sem2.task1;



public class Main {
    public static void print_arr2d(int [][] array){
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
         }
    }

    public static void main(String[] args) {
        int [][] arr2d = {{1,2, 3}, {5,6,4}} ;
        print_arr2d(arr2d);
        IteratorFor2DArray it = new IteratorFor2DArray(arr2d);
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
