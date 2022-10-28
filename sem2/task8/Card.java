package sem2.task8;

public class Card {
    int balance = 0;
    int trips = 0;
    String cardType = "Обычная";
    
    public Card(int balance, int trips, String cardType){
        this.balance = balance; //баланс, кол-во денег
        this.trips = trips; //кол-во поездок
        this.cardType = cardType; //тип карты
    }
    public Card(){}

    public Card(String cardType){
        this.balance = 0;
        this.trips = 0;
        this.cardType = cardType;
    }

    public void balance_replenishment(int money){
        if (money >= 0){
            this.balance += money;
        }
    }

    public void add_trips(int trips){
        if (trips >0){
            this.trips += trips;
        }
    }



    public static void main(String[] args) {
        // Card test1 = new Card(120,0,"Nhjqrf");
        Card test1 = new Card();
        System.out.println(test1.cardType); 
    }

    

}
