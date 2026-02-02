package chapter9.exercises.employeeHierachy;

import chapter9.examples.commisionEmployee.CommissionEmployee;

public class CommissionEmployeeTest {
    public static void main(String[] args) {

        BasePlusCommissionEmployee basePlus=new BasePlusCommissionEmployee(
                "Sue","Jones","222-22-2222",10000,.06,1500);


        System.out.println("Employee information obtained by get methods");
        System.out.printf("%n%s %s%n","First name is ",basePlus.getFirstName());
        System.out.printf("%n%s %s%n","Last name is ",basePlus.getLastName());
        System.out.printf("%n%s %s%n","Social security number is ",basePlus.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n","Gross sales is ",basePlus.getCommissionEmployee().getGrossSale());
        System.out.printf("%s %.2f%n","Commission rate is ",basePlus.getCommissionEmployee().getCommissionRate());
        System.out.printf("%s %.2f%n","Base Salary is ",basePlus.getBaseSalary());

        basePlus.getCommissionEmployee().setGrossSale(5000);
       basePlus.getCommissionEmployee().setCommissionRate(.1);

        System.out.printf("%n%s:%n%n%s%n","Updated commission employee information obtained by toString ",basePlus.getCommissionEmployee().toString());
    System.out.printf("%n%s:%n%n%s%n","Updated basePlus commission employee information obtained by toString ",basePlus);
    }
}
