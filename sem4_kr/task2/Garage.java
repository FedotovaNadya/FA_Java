package sem4_kr.task2;
import java.util.Arrays;
import java.util.Comparator;
public class Garage {
    
    int max_capacity;
    int carCount = 0;
    Ferrari[] ferrari;
    Solaris[] solaris;


    public Garage(int max_capacity){
        this.max_capacity = max_capacity;
    }

    public void addCar(Ferrari ferrari){
        if (this.carCount<this.max_capacity){
        this.carCount +=1;
        this.ferrari[this.ferrari.length] = ferrari;}
    }

    public void addCar(Solaris solaris){
        if (this.carCount<this.max_capacity){
        this.carCount +=1;
        this.solaris[this.solaris.length] = solaris;}
    }

    public void getInfo(){
        if (this.solaris.length > this.ferrari.length){
            for (int i=0; i <this.ferrari.length;i++){
                System.out.println(this.ferrari[i]);
            }
            for (int i=0; i <this.solaris.length;i++){
                System.out.println(this.solaris[i]);
            }
        }
        else{
            for (int i=0; i <this.solaris.length;i++){
                System.out.println(this.solaris[i]);
            }
            for (int i=0; i <this.ferrari.length;i++){
                System.out.println(this.ferrari[i]);
            }
        }
    }
}
