package chapter9.examples.commisionEmployeeWithMethodsManipulation;

public class BaePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BaePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSale,double commissionRate,double baseSalary){
        super(firstName,lastName,socialSecurityNumber,grossSale,commissionRate);

        if (baseSalary<0.0){
            throw new IllegalArgumentException("Gross sales must be >=0.0");
        }
        this.baseSalary=baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary()+ super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s:%.2f%n%s: %.2f%n%s: %.2f",
                "Commission payrollSystem",getFirstName(),getLastName(),"social security number",
                getSocialSecurityNumber(),"gross sales",getGrossSale(),"commission rate",getCommissionRate(),"base salary",getBaseSalary());
    }
}
