package chapter10.exercises.implementingThePayableInterface;

public class CommissionCompensationModel implements CompensationModel {
    private double grossSale;
    private double commissionRate;

    public CommissionCompensationModel( double grossSale, double commissionRate) {
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

}
