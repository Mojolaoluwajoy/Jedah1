package chapter10.exercises.PayrollSystemModification.payrollSystem;

public abstract class Employee {
    private  final String firstName;
    private  final String lastName;
    private  final String socialSecurityNumber;
    private Date birthDate;

    public Employee(String firstName,String lastName,String socialSecurityNumber,Date birthDate){
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;
        this.birthDate=birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
public int getBirthMonth(){
      return  birthDate.getMonth();
}
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s%nBirthday %s",getFirstName(),getFirstName(),getSocialSecurityNumber(),birthDate.toString());
    }
    public abstract double earnings();
}
