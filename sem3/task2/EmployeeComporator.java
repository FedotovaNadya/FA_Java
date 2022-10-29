package sem3.task2;

import java.util.Comparator;

public class EmployeeComporator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        int rez=0;
        if (o1.averageMonthlySalary() > o2.averageMonthlySalary()) rez=-1;
        if (o1.averageMonthlySalary() < o2.averageMonthlySalary()) rez=1;
        if (o1.averageMonthlySalary() == o2.averageMonthlySalary()){
            rez = o1.getFio().compareTo(o2.getFio());
            // System.out.println("here");
        };

        return rez ;
    }
}
