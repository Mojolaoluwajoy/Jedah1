package chapter6;
import java.util.Scanner;

public class BeautifyingString {
    public static String addFullStop(String theString){

        if (!theString.endsWith(".")){
            theString+=".";
        }
        return theString;
    }

    public static String capitalizeFirstLetter(String theString){
        return theString.substring(0,1).toUpperCase() + theString.substring(1);
    }

    public static void main(String[] args) {
        Scanner mojo =new Scanner(System.in);

        System.out.println("Enter the string you'd like to beautify: ");
        String stringToBeautify=mojo.nextLine();

        String capital= capitalizeFirstLetter(stringToBeautify);
        String fullStop = addFullStop(capital);

        System.out.println("The beautified String: "+fullStop);
    }
}
