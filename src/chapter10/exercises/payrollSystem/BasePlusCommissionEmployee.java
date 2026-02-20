package chapter10.exercises.payrollSystem;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate,double baseSalary) {
super(firstName,lastName,socialSecurityNumber,grossSale,commissionRate);

if (baseSalary<0.0){
    throw new IllegalArgumentException("Base salary must be >=0.0");
}
this.baseSalary=baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary<0.0){
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() * super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f","Base - salaried",super.toString(),
                "base salary" ,getBaseSalary());
    }
}