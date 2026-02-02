package chapter9.exercises.combiningCompositionAndInheritanc;

public class Test {
    public static void main(String[] args) {
        CompensationModel compensationModel=new CommissionCompensationModel(3000,.1);
        Employee employee1=new Employee("Mojola","Adebola","564-45-7765",compensationModel);
        System.out.printf("%s: %s %s%n%s: %s%n%s:%.2f%n","employee names",employee1.getFirstName(),employee1.getLastName(),"social security number",employee1.getSocialSecurityNumber(),"Earnings",compensationModel.earnings());



    CompensationModel basePlusCompensationModel=new BasePlusCommissionCompensationModel(2000,.1,5000);
        Employee employee2 =new Employee("Mojola","Adebola","564-45-7765",compensationModel);
        System.out.printf("%s: %s %s%n%s: %s%n%s:%.2f%n","employee names", employee2.getFirstName(), employee2.getLastName(),"social security number",employee2.getSocialSecurityNumber(),"Earnings",basePlusCompensationModel.earnings());
    }
}
