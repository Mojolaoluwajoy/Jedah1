package chapter9.examples.commisionEmployeeWithMethodsManipulation;

public class CommissionEmployeeTest {
    public static void main(String[] args) {

        BaePlusCommissionEmployee employee=new BaePlusCommissionEmployee("Sue","Jones","222-22-2222",10000,.06,3000);

        System.out.println("Employee information obtained by get methods");
        System.out.printf("%n%s %s%n","First name is ",employee.getFirstName());
        System.out.printf("%n%s %s%n","Last name is ",employee.getLastName());
        System.out.printf("%n%s %s%n","Social security number is ",employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n","Gross sales is ",employee.getGrossSale());
        System.out.printf("%s %.2f%n","Commission rate is ",employee.getCommissionRate());
        System.out.printf("%s %.2f%n","Base salary is ",employee.getBaseSalary());

        employee.setGrossSale(5000);
        employee.setCommissionRate(.1);

        System.out.printf("%n%s:%n%n%s%n","Updated payrollSystem information obtained by toString ",employee);
    }
}
