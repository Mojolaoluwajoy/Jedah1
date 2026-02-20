package chapter10.exercises.compositionAndInheritance;

public class BasePlusCommissionCompensationModel implements CompensationModel{

    private double baseSalary;
    private double grossSale;
    private double commissionRate;

    public BasePlusCommissionCompensationModel(double grossSale, double commissionRate, double baseSalary) {

        if (baseSalary<0.0){
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }
        this.baseSalary=baseSalary;
        this.grossSale=grossSale;
        this.commissionRate=commissionRate;
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

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return getBaseSalary() +grossSale *getCommissionRate();
    }

}
