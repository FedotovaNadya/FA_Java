package sem1_2.task5;

class Returner {
    int[] valuesArr;
    int[] scalesArr;
    int[] rangesArr;
    int sum = 0;

    public Returner(int[] values, int[] scales) {
        valuesArr = values;
        scalesArr = scales;
        rangesArr = new int[valuesArr.length];

        // Сумма длин всех отрезков
        sum = 0;

        for (int i = 0; i < scalesArr.length; i++)
            sum += scalesArr[i];

        int s = 0;
        for (int i = 0; i < rangesArr.length; i++) {
            rangesArr[i] = s;
            s += scalesArr[i];
        }
    }


    public int getNumber() {
        int random = (int) (Math.random() * (sum - 1));

        int index = 0;
        for (int i = 0; i < rangesArr.length; i++) {
            if (rangesArr[i] > random)
                break;
            index = i;
        }

        return valuesArr[index];
    }
}

public class Main {

    public static void main(String[] args) {

        int[] values = {1, 2, 3};
        int[] scales = {1, 2, 10};

        Returner returner = new Returner(values, scales);
        int returnValue = returner.getNumber();
        System.out.println("Возвращенное значение: "+returnValue);
    }

}