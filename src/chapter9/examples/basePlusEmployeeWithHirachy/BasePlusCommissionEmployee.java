package chapter9.examples.basePlusEmployeeWithHirachy;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSale,double commissionRate,double baseSalary){
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
        return baseSalary+(commissionRate *grossSale);
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s:%.2f%n%s: %.2f%n%s: %.2f",
                "Commission payrollSystem",firstName,lastName,"social security number",
                socialSecurityNumber,"gross sales",grossSale,"commission rate",commissionRate,"base salary",baseSalary);
    }
}
