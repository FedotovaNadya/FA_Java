package sem3.task2;

import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void printEmployees(Employee [] employees){
        for (Employee employee : employees) {
            System.out.println(employee.getFio());
        }
    }
    public static void main(String[] args) {
        FixEmploee f1 = new FixEmploee("Петров В.В.", 1, 30000); //30 000
        FixEmploee f2 = new FixEmploee("Фролов Д.О.", 2, 25000); //25 000
        FixEmploee f3 = new FixEmploee("Панков Н.Ю.", 3, 35000); //35 000

        FixEmploee f4 = new FixEmploee("Кононец В.В.", 4, 35000); //35 000
        FixEmploee f5 = new FixEmploee("Синицын Ю.Н.", 5, 35000); //35 000

        HourlyEmploee h1 = new HourlyEmploee("Попович О.М.", 6, 160); //26 624
        HourlyEmploee h2 = new HourlyEmploee("Баштовая А.Г.", 7, 180); //29 952
        HourlyEmploee h3 = new HourlyEmploee("Апенько Н.С.", 8, 200); //33 280
        Employee [] employees = {f1, f2, f3,f4,f5, h1, h2, h3};
        //test 
        // System.out.println(employees[0].averageMonthlySalary());
        // printEmployees(employees);
        //A
        
        Comparator<Employee> emploeesComparator = new EmployeeComporator();      
        Arrays.sort(employees, emploeesComparator);

        //B
        for (int i = 0; i < 5; i++) {
            System.out.println(employees[i].getFio());
        }
        //С
        for (int i = (employees.length-3);i<employees.length;i++ ){
            System.out.println(employees[i].getId());
        }

    }
}
