import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalMiles=0;
        int totalGallons=0;
        int trip =0;

        System.out.println("Enter the first miles:");
        int miles = input.nextInt();
        input.nextLine();
        System.out.println("Enter the first gallons:");
        int gallons= input.nextInt();
        input.nextLine();



        while (miles !=-5 && gallons != -5) {

            double mpg =(double) miles/gallons;
            System.out.printf("MILES PER GALLON:%.2f%n",mpg);

            trip++;

            System.out.println("Enter the next miles");
            miles = input.nextInt();
            input.nextLine();
            System.out.println("Enter the next gallons:");
            gallons= input.nextInt();input.nextLine();


            totalMiles += miles;
         totalGallons += gallons;



        }


       double combinedMpg = (double)totalMiles/totalGallons;
       System.out.printf("COMBINED MILES PER GALLON:%.2f%n",combinedMpg);




    }
}

