package chapter10.exercises.compositionAndInheritance;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee("John", "smith", "666-66-6666", new SalariedCompensationModel(1500));
        Employee employee2=new Employee("Joe", "Pen", "999-99-999", new HourlyCompensationModel(500,30));
        Employee employee3=new Employee("Abram", "lot", "222-22-2222", new CommissionCompensationModel(2000,.1));
        Employee employee4=new Employee("Joane", "Jane", "555-55-5555", new BasePlusCommissionCompensationModel(1500,0.1,200));

        System.out.printf("%nSalariedEmployee: %sEarned: $%,.2f%n",employee1,employee1.earnings());
        System.out.printf("%nHourlyEmployee: %sEarned: $%,.2f%n",employee2,employee2.earnings());
        System.out.printf("%nCommissionEmployee: %sEarned: $%,.2f%n",employee3,employee3.earnings());
        System.out.printf("%nBasePlusCommissionEmployee: %sEarned: $%,.2f%n",employee4,employee4.earnings());

        System.out.println("\nAfter dynamically changing Employee's compensation model");
        employee1.setCompensationModel(new SalariedCompensationModel(6000));
        employee2.setCompensationModel(new HourlyCompensationModel(400,40));
        employee3.setCompensationModel(new CommissionCompensationModel(4500,.01));
        employee4.setCompensationModel(new BasePlusCommissionCompensationModel(6000,.05,350));

        System.out.printf("%nSalariedEmployee: %sEarned: $%,.2f%n",employee1,employee1.earnings());
        System.out.printf("%nHourlyEmployee: %sEarned: $%,.2f%n",employee2,employee2.earnings());
        System.out.printf("%nCommissionEmployee: %sEarned: $%,.2f%n",employee3,employee3.earnings());
        System.out.printf("%nBasePlusCommissionEmployee: %sEarned: $%,.2f%n",employee4,employee4.earnings());

    }
}
