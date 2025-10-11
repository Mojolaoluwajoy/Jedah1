package CHAP4;

public class WorldPopulationGrowth {
    public static void main(String[] args) {

        long currentPopulation = 8245578922L;
        double currentGrowthRate = 0.00836;
        int year = 1;
        double newPopulation =0;
        System.out.println("YEAR\tPOPULATION");
        while (year <= 75) {
            double growthRate = currentGrowthRate / 100;
            newPopulation = currentPopulation + (currentPopulation * currentGrowthRate);
            System.out.printf("%d\t\t%.0f%n",year,newPopulation);
            currentPopulation=(long)newPopulation;

            year++;

        }

    }
}

