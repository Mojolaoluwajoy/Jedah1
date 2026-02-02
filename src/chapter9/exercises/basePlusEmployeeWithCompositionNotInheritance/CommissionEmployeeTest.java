package chapter9.exercises.basePlusEmployeeWithCompositionNotInheritance;

public class CommissionEmployeeTest {
    public static void main(String[] args) {


        BasePlusCommissionEmployee employee=new BasePlusCommissionEmployee("Sue","Jones","222-22-2222",10000,.06,5000);
        System.out.println("Employee information obtained by get methods");
        System.out.printf("%n%s %s%n","First name is ",employee.getCommissionEmployee().getFirstName());
        System.out.printf("%n%s %s%n","Last name is ",employee.getCommissionEmployee().getLastName());
        System.out.printf("%n%s %s%n","Social security number is ",employee.getCommissionEmployee().getSocialSecurityNumber());
        System.out.printf("%s %.2f%n","Gross sales is ",employee.getCommissionEmployee().getGrossSale());
        System.out.printf("%s %.2f%n","Commission rate is ",employee.getCommissionEmployee().getCommissionRate());
        System.out.printf("%s %.2f%n","Base Salary is ",employee.getBaseSalary());

        employee.getCommissionEmployee().setGrossSale(5000);
        employee.getCommissionEmployee().setCommissionRate(.1);

        System.out.printf("%n%s:%n%n%s%n","Updated employee information obtained by toString ",employee);
    }
}
