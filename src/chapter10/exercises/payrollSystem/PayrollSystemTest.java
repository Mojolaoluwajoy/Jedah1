package chapter10.exercises.payrollSystem;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee=new SalariedEmployee("John","Smith","111-11-1111",800.00);

  HourlyEmployee hourlyEmployee=new HourlyEmployee ("Karen","Price","222-22-2222",16.75,40);

  CommissionEmployee commissionEmployee=new CommissionEmployee("Sue","Jones","333-33-3333",10000,.06);

  BasePlusCommissionEmployee basePlusCommissionEmployee=new BasePlusCommissionEmployee("Bob","Lewis","444-44-4444",5000,.04,300);
 PieceWorker pieceWorker=new PieceWorker("Rai","Rai","66-666-6666",300.00,40);

         Employee[] employees=new Employee[5];
    employees[0]=salariedEmployee;
    employees[1]=hourlyEmployee;
    employees[2]=commissionEmployee;
    employees[3]=basePlusCommissionEmployee;
    employees[4]=pieceWorker;
        System.out.println("Employees processed polymorphically");

        for (Employee currentEmployee: employees){
            System.out.println(currentEmployee);

            System.out.printf("earned $%,.2f%n%n",currentEmployee.earnings());
        }
    }
}