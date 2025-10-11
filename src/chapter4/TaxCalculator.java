package chapter4;

import java.util.Scanner;
public class TaxCalculator {
    private String name;
    private int yearlyIncome;

    public TaxCalculator(String name, int yearlyIncome) {
        this.name = name;
        this.yearlyIncome = yearlyIncome;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYearlyIncome(int yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    public int getYearlyIncome() {
        return yearlyIncome;
    }

    public double totalTax() {
        double totalTax;
        if (yearlyIncome <= 30000) {
            totalTax = yearlyIncome * 0.15;
        } else {
            totalTax = yearlyIncome * 0.20;
        }
        return totalTax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Citizen's name:");
        String name = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Enter the citezen's yearly income:");
        int yearlyIncome = scanner.nextInt();
        scanner.nextLine();

        TaxCalculator citizen1 = new TaxCalculator(name, yearlyIncome);
        System.out.printf("Citizen's name:%s%nCitizen's yearly income:$%d%ntotal tax:$%.2f%n", citizen1.getName(), citizen1.getYearlyIncome(), citizen1.totalTax());

        System.out.print("Enter the Citizen's name:");
        name = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Enter the citezen's yearly income:");
        yearlyIncome = scanner.nextInt();
        scanner.nextLine();

        TaxCalculator citizen2 = new TaxCalculator(name, yearlyIncome);
        System.out.print("Enter the Citizen's name:");
        name = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Enter the citezen's yearly income:");
        yearlyIncome = scanner.nextInt();
        scanner.nextLine();

        TaxCalculator citizen3 = new TaxCalculator(name, yearlyIncome);
        System.out.printf("Citizen's name:%s%nCitizen's yearly income:$%d%ntotal tax:$%.2f%n", citizen3.getName(), citizen3.getYearlyIncome(), citizen3.totalTax());

    }
}
