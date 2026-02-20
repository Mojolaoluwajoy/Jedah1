package chapter10.exercises.payable;

import chapter9.examples.commisionEmployeeWithMethodsManipulation.BaePlusCommissionEmployee;

public class Main {
    public static void main(String[] args) {

        Payable[] payableObjects=new Payable[]{
                new Invoice("01234","seat",2,375.00),
                new Invoice("56789","tire",4,79.95),
                new SalariedEmployee("John","Smith","111-11-1111",80.00),
               new HourlyEmployee("Karen","Price","222-22-2222",16.75,40),
               new CommissionEmployee("Sue","Jones","333-33-3333",10000,.06),
               new BasePlusCommissionEmployee("Bob","Lewis","444-44-4444",5000,.04,300)
        };
        System.out.println("Invoices and Employees processed polymorphically:");

        for (Payable currentPayable:payableObjects){
            System.out.printf("%n%s %n",currentPayable.toString());
            if (currentPayable instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee=(BasePlusCommissionEmployee) currentPayable;
               employee.setBaseSalary(1.10* employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is : $%,.2f%n",employee.getBaseSalary());
            }
            System.out.printf("Payment amount: $%,.2f%n",currentPayable.getPaymentAmount());

        }
    }
}
