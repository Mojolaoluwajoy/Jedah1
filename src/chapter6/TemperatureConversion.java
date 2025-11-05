package chapter6;
import java.util.Scanner;
public class TemperatureConversion {
    Scanner mojo=new Scanner(System.in);
   private double kelvinEquivalent;
   private double celsiusEquivalent;
    private static double kelvin=0;
    private static double celsius=0;

    public static double kelvinEquivalent(Scanner mojo){
        System.out.println("Kindly enter a temperature in Celsius: ");
      double celsius =mojo.nextDouble();
     double kelvin=celsius+273.15;
        System.out.println("The kelvin equivalent of "+celsius+"°C is "+kelvin);
        return kelvin;
    }
   public static double celsiusEquivalent(Scanner mojo){
        System.out.println("Kindly enter a temperature in kelvin: ");
     double kelvin =mojo.nextDouble();
    double  celsius=kelvin-273.15;
    System.out.println("The kelvin equivalent of "+kelvin+" is "+celsius+"°C");
       return celsius;
    }

    public static void main(String[] args) {
        Scanner mojo = new Scanner(System.in);
        TemperatureConversion conversion = new TemperatureConversion();
        String sentinel = "Exit";
        String quitValue = "";
        while (!sentinel.equalsIgnoreCase(quitValue)) {
            conversion.celsiusEquivalent(mojo);
            conversion.kelvinEquivalent(mojo);
            System.out.println();
            mojo.nextLine();
            System.out.println("Enter the sentinel value (Exit)to terminate or any other value to continue: ");
            quitValue = mojo.nextLine();


        }
    }
}
