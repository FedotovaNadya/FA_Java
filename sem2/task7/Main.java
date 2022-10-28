package sem2.task7;

public class Main {
    public static void buildDictionary(String text){
        text = text.toLowerCase();

        int[] result = new int['я' - 'а' + 1];
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'а' && ch <= 'я'){
                result[ch - 'а']++;
            }
        }

        for(int i = 0; i < result.length; i++){
            System.out.println((char) (i + 'а') + " = " + result[i]);
        }
    }
    public static void main(String[] args) {
        String text = "Реализовать метод, который добавляет 1 000 000 случайных элементов в ArrayList и LinkedList. Реализовать второй метод, который выбирает из списка элемент наугад 100 000 раз. Замерьте время и скажите кто быстрее. Реализовать частотный словарь слов русского языка (на вход принимается текст любой размерности)";
        buildDictionary(text);
    }
}
