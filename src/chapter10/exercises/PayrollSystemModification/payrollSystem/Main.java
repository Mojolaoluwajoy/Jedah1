package chapter10.exercises.PayrollSystemModification.payrollSystem;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee=new SalariedEmployee("John","Smith","111-11-1111",new Date(2,20,1999),800.00);

  HourlyEmployee hourlyEmployee=new HourlyEmployee("Karen","Price","222-22-2222",new Date(3,15,2000),16.75,40);

  CommissionEmployee commissionEmployee=new CommissionEmployee("Sue","Jones","333-33-3333",new Date(4,13,1998),10000,.06);

  BasePlusCommissionEmployee basePlusCommissionEmployee=new BasePlusCommissionEmployee("Bob","Lewis","444-44-4444",new Date(5,11,1992),5000,.04,300);


        System.out.println("Employees processed individually:");
        System.out.printf("%n%s%n%s: $%,.2f%n%n",salariedEmployee,"earned",salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",hourlyEmployee,"earned",hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",commissionEmployee,"earned",commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",basePlusCommissionEmployee,"earned",basePlusCommissionEmployee.earnings());

    Employee[] employees=new Employee[4];
    employees[0]=salariedEmployee;
    employees[1]=hourlyEmployee;
    employees[2]=commissionEmployee;
    employees[3]=basePlusCommissionEmployee;
        System.out.println("Employees processed polymorphically");
        System.out.println();
        for (int currentMonth=1;currentMonth<=6;currentMonth++) {
            Utils.monthsList(currentMonth);
            for (Employee currentEmployee : employees) {
                System.out.println(currentEmployee);
                System.out.printf("earned $%,.2f%n", currentEmployee.earnings());

                if (currentMonth==currentEmployee.getBirthMonth()){
                    System.out.println("""
Congratulations,an extra $100.00 will be added
to your payroll for this month,in celebration
of your birthday.""");
                    double earnings=currentEmployee.earnings();
                    earnings+=100.00;
                    System.out.printf("Your earnings with your " +
                            "birthday bonus added: $%,.2f%n",earnings);
                    }
                System.out.println();
            }
            System.out.println();
        }
    }
}