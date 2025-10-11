package chapter5;

public class ModifiedAutoPolicyTest {
    public static void main(String[] args) {
        ModifiedAutoPolicy policy1 =new ModifiedAutoPolicy(111111111,"Toyota Camry","PH");
        ModifiedAutoPolicy policy2 =new ModifiedAutoPolicy(222222222,"Ford Fusion","MJ");
       modifiedPolicyInNoFaultState(policy1);
        modifiedPolicyInNoFaultState(policy2);
    }

    public static void modifiedPolicyInNoFaultState (ModifiedAutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s;%nState %s  a no fault state%n%n",policy.getAccountNumber(),policy.getMakeAndModel(),
                (policy.isNoFaultState()? "is": "is not"));
    }
}
