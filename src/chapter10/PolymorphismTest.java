package chapter10;

import chapter9.examples.commisionEmployeeWithMethodsManipulation.BaePlusCommissionEmployee;
import chapter9.exercises.basePlusEmployeeWithCompositionNotInheritance.CommissionEmployee;

public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee=new CommissionEmployee("Sue","jones","222-22-2222",1000,.06);

        BaePlusCommissionEmployee baePlusCommissionEmployee=new BaePlusCommissionEmployee("Bob","Lewis","333-33-3333",5000,.04,300);

    }
}
