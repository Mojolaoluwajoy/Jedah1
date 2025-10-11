package chapter3;

public class CarApplication {
             public static void main(String[] args) {
             
             Car car = new Car ("lexus", "2020",18000000.00,5.00,7.00);
             Car car2 =new Car ("venza", "2018" ,8000000.72,5.00,7.00);




             System.out.printf(" Car model: %s%n Car year: %s%n Car price: %.2f%n", car.getModel(),car.getYear(),car.getPrice());
             System.out.printf(" Car2 model: %s%n Car2 year: %s%n Car2 price: %.2f%n", car2.getModel(),car2.getYear(),car2.getPrice());


             System.out.printf(" Final Price for car1: %.2f%n Final Price for car2: %.2f", car.getFirstLastPrice (),car2.getSecondLastPrice());
              

}


}