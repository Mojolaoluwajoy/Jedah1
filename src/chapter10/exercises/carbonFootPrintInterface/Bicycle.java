package chapter10.exercises.carbonFootPrintInterface;

public class Bicycle implements CarbonFootPrint{
    private String pedalType;

    public Bicycle(String pedalType){
        this.pedalType=pedalType;
    }

    public String getPedalType() {
        return pedalType;
    }

    @Override
    public double getCarbonFootPrint() {
        return 150;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n","Pedal type",getPedalType());
    }
}
