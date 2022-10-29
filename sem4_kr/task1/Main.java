package sem4_kr.task1;

public class Main {
    public static void main(String[] args) {
        Reader [] readers= {
            new Reader("Петров В. В.", "001", "itiabd","12-12-2002", "89670864620"),
            new Reader("Смирнов П. А.", "002", "itiabd","04-10-1985", "88005553535"),
            new Reader("Фролов Д. О.", "003", "itiabd","18-06-1999", "89291304562"),
            new Reader("Трошин А. А.", "004", "itiabd","27-04-1999", "89011479812"),
            
        };

        Book book1= new Book("Мертвые души", "Гоголь Н.В.");
        Book book2= new Book("Маленький принц", "Антуан де Сент-Экзюпери");
        Book book3= new Book("1984", "Джордж Оруэлл");

        readers[0].takeBook(3);
        readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[2].takeBook(book3);
        readers[0].returnBook(3);
        readers[1].returnBook("Приключения", "Словарь", "Энциклопедия");
        readers[3].returnBook(book1, book2);
    }
}
