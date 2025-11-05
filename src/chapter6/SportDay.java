package chapter6;
import java.util.Scanner;
public class SportDay {
    private int temperature;

    public void temperature() {

        System.out.println("Enter today's temperature in Celsius to  get the perfect sport day recommendation  ");
        temperature = new Scanner(System.in).nextInt();

    }

    public void sportsRecommender() {
        if (temperature >= 20 && temperature <= 30) {
            System.out.println("it's a lovely weather for sports today.");
        } else if (temperature >= 10&& temperature<=40) {
            System.out.println("it's reasonable weather for sports today.");
        }
        else{
            System.out.println("Please exercise with care today,watch out for the weather");
        }
    }
}
