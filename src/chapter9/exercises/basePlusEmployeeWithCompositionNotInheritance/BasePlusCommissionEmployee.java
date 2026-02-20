package chapter9.exercises.basePlusEmployeeWithCompositionNotInheritance;

public class BasePlusCommissionEmployee  {

   private CommissionEmployee commissionEmployee;
    private double baseSalary;


    public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSale,double commissionRate,double baseSalary){
        if (baseSalary<0.0){
            throw new IllegalArgumentException("Gross sales must be >=0.0");
        }
        this.commissionEmployee=new CommissionEmployee(firstName, lastName,socialSecurityNumber, grossSale,commissionRate);
         this.baseSalary=baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    public double earnings() {
        return baseSalary+(commissionEmployee.getCommissionRate() *commissionEmployee.getGrossSale());
    }
    public CommissionEmployee getCommissionEmployee(){
        return commissionEmployee;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s:%.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "Commission payrollSystem",commissionEmployee.getFirstName(),commissionEmployee.getLastName(),"social security number",
              commissionEmployee.getSocialSecurityNumber(),"gross sales",commissionEmployee.getGrossSale(),"commission rate",commissionEmployee.getCommissionRate(),"base salary",getBaseSalary(),"Earnings",earnings());
    }
}
