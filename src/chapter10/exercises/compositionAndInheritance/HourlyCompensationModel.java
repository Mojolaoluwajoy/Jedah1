package chapter10.exercises.compositionAndInheritance;

public class HourlyCompensationModel implements CompensationModel{
    private  double wage;
    private double hour;

    public HourlyCompensationModel(double wage, double hour){
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
}

