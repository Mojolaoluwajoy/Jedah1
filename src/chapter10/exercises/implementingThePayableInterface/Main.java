package chapter10.exercises.implementingThePayableInterface;


import chapter10.exercises.payable.BasePlusCommissionEmployee;

public class Main {
    public static void main(String[] args) {

       Payable [] payableObjects=new Payable[]{
                new Invoice("01234", "seat", 2, 375.00),
                new Invoice("56789", "tire", 4, 79.95),
                new Employee("John", "smith", "666-66-6666", new SalariedCompensationModel(1500)),
                new Employee("Joe", "Pen", "999-99-999", new HourlyCompensationModel(500, 30)),
                new Employee("Abram", "lot", "222-22-2222", new CommissionCompensationModel(2000, .1)),
                new Employee("Joane", "Jane", "555-55-5555", new BasePlusCommissionCompensationModel(1500, 0.1, 200))
  };
        System.out.println("Invoices and Employees processed polymorphically:");

        for (Payable currentPayable : payableObjects) {
            System.out.printf("%n%s %npayment due: $%,.2f%n", currentPayable.toString(), currentPayable.getPaymentAmount());
        }
    }}