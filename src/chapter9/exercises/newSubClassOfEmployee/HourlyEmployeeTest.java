package chapter9.exercises.newSubClassOfEmployee;

import chapter9.exercises.employeeHierachy.Employee;

public class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployee employee=new HourlyEmployee("Omobolanle","Adebola","33-333-3333",5,50);
        System.out.printf("%s%n%n%s","Hourly employee details",employee);
    }

}
