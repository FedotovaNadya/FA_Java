package sem6.task1;

public class Main {
    public static String printN(int n) {
        if (n == 0)
            return ""; // не забываем про выход из метода
        else
        printN(n - 1);
        System.out.println(n);
    
        //String output = "[" + (i - 1) + "] " + aValues[i - 1] + "\n";

        //sb.append(n);
        //return sb.toString();
        return "";
}
    public static void main(String[] args) {
        printN(15);
        System.out.println("");
        printN(5);
        
    }
        
    
}
