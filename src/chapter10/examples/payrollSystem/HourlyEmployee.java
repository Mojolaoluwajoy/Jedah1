package chapter10.examples.payrollSystem;

public class HourlyEmployee extends Employee{
    private  double wage;
    private double hour;

    public HourlyEmployee(String firstName,String lastName,String socialSecurityNumber,double wage,double hour){
        super(firstName,lastName,socialSecurityNumber);
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >=0.0");
        }
        if (hour < 0.0|| hour>168.0) {
            throw new IllegalArgumentException("Hours worked must be >=0.0  and <=168.0");
        }
        this.wage=wage;
        this.hour=hour;
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >=0.0");
        }
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setHour(double hour) {
        if (hour < 0.0|| hour>168.0) {
            throw new IllegalArgumentException("Hours worked must be >=0.0  and <=168.0");
        }
        this.hour = hour;
    }

    public double getHour() {
        return hour;
    }

    @Override
    public double earnings() {
        if (getHour() <= 40) {
            return getWage()*getHour();
        }else {
            return 40*getWage() +(getHour()-40)*getWage()*1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee:%s%n%s: $%,.2f; %s: %,.2f" ,
                super.toString(),"hourly wage",getWage(),
                "hours worked" ,getHour());
    }
}
