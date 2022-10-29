package sem3.task2;

public class FixEmploee extends Employee{
    double salary;
    public FixEmploee(String fio, int id, double salary) {
        super(fio, id);
        this.salary = salary;
    }

    @Override
    double averageMonthlySalary() {
        return this.salary;
    }
    
}
