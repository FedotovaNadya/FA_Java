package sem3.task2;

public class HourlyEmploee extends Employee{
    double ratePerHour ;
    double perHours = 20.8*8;

    public HourlyEmploee(String fio, int id, double rate) {
        super(fio, id);
        this.ratePerHour = rate;
    }

    @Override
    double averageMonthlySalary() {
        return ratePerHour*perHours;
    }
    
}
