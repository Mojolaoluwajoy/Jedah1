package chapter9.exercises.employeeHierachy;

public class BasePlusCommissionEmployee extends Employee {
    private double baseSalary;
private CommissionEmployee commissionEmployee;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale,double commissionRate ,double baseSalary){
       super(firstName,lastName,socialSecurityNumber);

        if (baseSalary<0.0){
            throw new IllegalArgumentException("Gross sales must be >=0.0");
        }
        this.commissionEmployee=new CommissionEmployee(firstName, lastName,socialSecurityNumber, grossSale,commissionRate);

        this.baseSalary=baseSalary;
    }

    public CommissionEmployee getCommissionEmployee(){
        return commissionEmployee;
    }



    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return baseSalary+(commissionEmployee.getCommissionRate() *commissionEmployee.getGrossSale());
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s:%.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "Commission employee",getFirstName(),getLastName(),"social security number",
                getSocialSecurityNumber(),"gross sales",commissionEmployee.getGrossSale(),"commission rate",commissionEmployee.getCommissionRate(),"base salary",baseSalary,"Earnings",earnings());
    }
}
