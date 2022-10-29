package sem4_kr.task1;

public class Reader {
    String fio;
    String libraryCard;
    String faculty;
    String birthDate;
    String phoneNumber;

    public Reader(String fio, String libraryCard, String faculty,String birthDate,String phoneNumber){
        this.fio =fio;
        this.libraryCard = libraryCard;
        this.faculty= faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }
    //take
    public void takeBook(int booksCount){
        System.out.println(this.fio+" взял "+booksCount+" книги ");
    }
    public void takeBook(String ... bookNames ){
        String s = this.fio+" взял книги:";
        for (int i=0; i<bookNames.length; i++){
            if (i!=0) s+=",";
            s += " "+bookNames[i];
        }
        System.out.println(s);
    }
    public void takeBook(Book ... books ){
        String s = this.fio+" взял книги:";
        for (int i=0; i<books.length; i++){
            if (i!=0) s+=",";
            s += " "+books[i].getTitile();
        }
        System.out.println(s);
    }
    //return
    public void returnBook(int booksCount){
        System.out.println(this.fio+" вернул "+booksCount+" книги ");
    }
    public void returnBook(String ... bookNames ){
        String s = this.fio+" вернул книги:";
        for (int i=0; i<bookNames.length; i++){
            if (i!=0) s+=",";
            s += " "+bookNames[i];
        }
        System.out.println(s);
    }
    public void returnBook(Book ... books ){
        String s = this.fio+" вернул книги:";
        for (int i=0; i<books.length; i++){
            if (i!=0) s+=",";
            s += " "+books[i].getTitile();
        }
        System.out.println(s);
    }
}
