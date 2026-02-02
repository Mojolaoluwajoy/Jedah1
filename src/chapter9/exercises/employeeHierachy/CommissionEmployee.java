package chapter9.exercises.employeeHierachy;

public class CommissionEmployee extends Employee{
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate){

        super(firstName,lastName,socialSecurityNumber);
        if (grossSale<0.0){
            throw new IllegalArgumentException("Gross sales must be >=0.0");
        }
        if (commissionRate<=0.0||commissionRate>=1.0){
            throw new IllegalArgumentException("commission rate must be >0.0 and less than 1.0");

        }
        this.grossSale=grossSale;
        this.commissionRate=commissionRate;
    }
    public void setGrossSale(double grossSale) {
        if (grossSale<0.0){
            throw new IllegalArgumentException("Gross sales must be >=0.0");
        }

        this.grossSale = grossSale;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate<=0.0||commissionRate>=1.0){
            throw new IllegalArgumentException("commission rate must be >0.0 and less than 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    public double earnings(){
        return commissionRate*grossSale;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s:%.2f%n%s: %.2f%n%s: %.2f",
                "Commission employee",getFirstName(),getLastName(),"social security number",
              getSocialSecurityNumber(),"gross sales",grossSale,"commission rate",commissionRate,"Earnings",earnings());
    }
}
