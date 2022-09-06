public class task4 {
    //- Даны две переменные. Поменяйте значения переменных друг с другом двумя способами
    public static void main(String[] args){
        int a, b;
        a=10;
        b=20;
        System.out.println("a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" b="+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("a="+a+" b="+b);
    }
}
