package chapter10.examples;

import chapter9.examples.commisionEmployeeWithMethodsManipulation.BaePlusCommissionEmployee;
import chapter9.examples.commisionEmployeeWithMethodsManipulation.CommissionEmployee;

public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee=new CommissionEmployee("Sue","jones","222-22-2222",1000,.06);

        BaePlusCommissionEmployee basePlusCommissionEmployee=new BaePlusCommissionEmployee("Bob","Lewis","333-33-3333",5000,.04,300);

        System.out.printf("%s%s:%n%n%s%n%n",
                "Call CommissionEmployee's toString with superclass reference ","to superClass object",commissionEmployee.toString());

     System.out.printf("%s%s:%n%n%s%n%n",
                "Call basePlusCommissionEmployee's toString with superclass ","reference to superClass object",basePlusCommissionEmployee.toString());

     CommissionEmployee commissionEmployee2=basePlusCommissionEmployee;
     System.out.printf("%s%s:%n%n%s%n",
                "Call basePlusCommissionEmployee's toString with superclass ","reference to superClass object",commissionEmployee2.toString());
    }
}
