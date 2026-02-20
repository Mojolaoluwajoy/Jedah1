package chapter10.exercises.payrollSystem;

public class CommissionEmployee extends Employee {
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSale,double commissionRate) {
super(firstName,lastName,socialSecurityNumber);

if (commissionRate<=0.0||commissionRate>=1.0){
    throw new IllegalArgumentException("Commission rate must be >0.0 and <1.0");
}
if (grossSale<=0.0){
    throw new IllegalArgumentException("Gross sale must be >0.0");
}
this.commissionRate=commissionRate;
this.grossSale=grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate<=0.0||commissionRate>=1.0){
            throw new IllegalArgumentException("Commission rate must be >0.0 and <1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSale(double grossSale) {
        if (grossSale<=0.0){
            throw new IllegalArgumentException("Gross sale must be >0.0");
        }
        this.grossSale = grossSale;
    }

    public double getGrossSale() {
        return grossSale;
    }

    @Override
    public double earnings() {
        return getCommissionRate()*getGrossSale();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f","Commission Employee" ,super.toString(),
                "gross Sale",getGrossSale(),
                "commission Rate",getCommissionRate());
    }
}
