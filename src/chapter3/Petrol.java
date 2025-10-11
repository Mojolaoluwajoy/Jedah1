package chapter3;

public class Petrol {
       public static void main(String[] args) {
       PetrolPurchase petrolPurchase = new PetrolPurchase ("Sango Ibadan Nigeria","Regular petrol", 50, 950.00,2.00);

      System.out.printf (" Station Location: %s%n Petrol Type: %s%n Petrol Quantity : %dL%n Price Per Liter: %.2f%n Percentage Discount: %.2f%%%n",
      petrolPurchase.getStationLocation(), petrolPurchase.getPetrolType(), petrolPurchase.getPetrolQuantity(), petrolPurchase.getPricePerLiter(), petrolPurchase.getPercentageDiscount());


      System.out.printf(" Purchase Amount: %.2f", petrolPurchase.getPurchaseAmount());



}


}