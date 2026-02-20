package chapter10.exercises.carbonFootPrintInterface;

public class Car implements CarbonFootPrint{
    private String enginePower;
    private double petrolConsumptionInLiters;
    private double distanceDrivenInKM;

    public Car(String enginePower,double petrolConsumptionInLiters,double distanceDrivenInKM){
        this.enginePower=enginePower;
        this.petrolConsumptionInLiters=petrolConsumptionInLiters;
        this.distanceDrivenInKM=distanceDrivenInKM;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public double getPetrolConsumptionInLiters() {
        return petrolConsumptionInLiters;
    }

    public double getDistanceDrivenInKM() {
        return distanceDrivenInKM;
    }

    @Override
    public double getCarbonFootPrint() {
        return (getPetrolConsumptionInLiters()/getDistanceDrivenInKM());
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %.5fL%n%s: %.5fkWh%n","enginePower",getEnginePower(),
                "petrolConsumptionInLiters",getPetrolConsumptionInLiters(),
                "distanceDrivenInKM=",getDistanceDrivenInKM());

    }
}
