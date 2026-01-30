package chapter8.exercises.food;

public class FoodTest {
    public static void main(String[] args) {
        System.out.println("Food types and numbers of calories");

        for (Food food:Food.values()){
            System.out.printf("%-10s%-45s%d%n",food,food.getType(),food.getNumberOfCalories());
        }
    }
}
