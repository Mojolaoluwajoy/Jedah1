package chapter8.examples.employeeDetails;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDAte;

    public Employee(String firstName,String lastName,Date birthDate,Date hireDAte){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.hireDAte=hireDAte;
    }
    public String toString(){
        return String.format("%s, %s Hired: %s Birthday: %s",lastName,firstName,hireDAte,birthDate);
    }
}
