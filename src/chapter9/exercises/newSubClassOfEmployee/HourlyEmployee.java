package chapter9.exercises.newSubClassOfEmployee;

import chapter9.exercises.employeeHierachy.Employee;

public class HourlyEmployee extends Employee {
    private int hour;
    private double wage;

    public HourlyEmployee (String firstName,String lastName,String socialSecurityNumber,int hour,double wage){
super(firstName,lastName,socialSecurityNumber);
if (hour<0 || hour>168){
    throw new IllegalArgumentException("Hour must be greater than zero and not higher than 168");
}
if (wage<0){
    throw new IllegalArgumentException("wage must be a non negative number");
}
this.hour=hour;
this.wage=wage;
    }

    public void setHour(int hour) {
        if (hour<0 || hour>168){
            throw new IllegalArgumentException("Hour must be greater than zero and not higher than 168");
        }

        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setWage(double wage) {
        if (wage<0){
            throw new IllegalArgumentException("wage must be a non negative number");
        }
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }
    public double earnings(){
        return wage*hour;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s:%d%n%s: %.2f$%n%s: %.2f%n",
                "Commission employee",getFirstName(),getLastName(),"social security number",
                getSocialSecurityNumber(),"Hours Worked",getHour(),"Wage per hour",getWage(),"Earnings",earnings());

    }
}
