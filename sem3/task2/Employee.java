package sem3.task2;

public abstract class Employee {
    private String fio;
    private int employeeId;
    public Employee(String fio, int id){
        this.fio = fio;
        this.employeeId = id;
    }
    abstract double averageMonthlySalary();

    public String getFio(){
        return this.fio;
    }
    public int getId(){
        return this.employeeId;
    }

}
