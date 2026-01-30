package chapter8.examples.employeeObjectTracking;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.printf("Employees before instantiation: %d%n",Employee.getCount());

        Employee employee1=new Employee("Susan","Baker");
        Employee employee2=new Employee("Bob","Blue");

        System.out.printf("Employees after instantiation: %n");
        System.out.printf("via employee1.getCount(): %d%n",employee1.getCount());
        System.out.printf("via employee2.getCount(): %d%n",employee1.getCount());
        System.out.printf("via Employee.getCount(): %d%n",employee1.getCount());


        System.out.printf("%nEmployee 1:%s %s%nEmployee 2: %s %s%n",employee1.getFirstName(),employee1.getLastName(),employee2.getFirstName(),employee2.getLastName());

    }
}
