import java.util.Scanner;
public class RightAngleTriangle {
    public static void main(String[] args) {
        int x =0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the right angle triangle:");
        int triangleBase= input.nextInt();

        while(x <= triangleBase) {
            int y =1;

            while (y <= x) {
                System.out.print("*");
                y++;
            }
            System.out.println();
            x++;
        }

    }
}
