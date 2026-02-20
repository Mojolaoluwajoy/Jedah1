package chapter10.exercises.carbonFootPrintInterface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CarbonFootPrint> carbonFootPrints=new ArrayList<>();
        carbonFootPrints.add(new Car("500P",58.0,800));
   carbonFootPrints.add(new Building(20,2,590));
   carbonFootPrints.add(new Bicycle("platform pedals"));

   for (CarbonFootPrint carbon:carbonFootPrints){
       System.out.println(carbon.getClass().getName());
       System.out.printf("%sCarbon footPrint: %.5fC02e%n",carbon,carbon.getCarbonFootPrint());
       System.out.println();
   }
    }
}
