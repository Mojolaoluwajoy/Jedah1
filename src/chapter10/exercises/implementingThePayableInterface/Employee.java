package chapter10.exercises.implementingThePayableInterface;

public class Employee implements Payable{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

   private CompensationModel compensationModel;
    public Employee(String firstName, String lastName, String socialSecurityNumber, CompensationModel compensationModel){
        this.compensationModel= compensationModel;
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;
    }

    public void setCompensationModel(CompensationModel compensationModel) {
        this. compensationModel=compensationModel;
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
    public double earnings(){
        return compensationModel.earnings();
    }

    @Override
    public double getPaymentAmount() {
        return earnings();
    }

    @Override
    public String toString() {
        return String.format("%n%s: %s %s%n%s: %s%n", "payrollSystem",firstName,lastName,"social security number",
                socialSecurityNumber);
    }
}
