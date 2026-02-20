package chapter10.exercises.carbonFootPrintInterface;

public class Building implements CarbonFootPrint{
    private int buildingNumber;
    private int numbersOfFloors;
    private int electricityConsumptionInKWH;

    public Building(int buildingNumber,int numbersOfFloors,int electricityConsumptionInKWH){
        this.buildingNumber=buildingNumber;
        this.numbersOfFloors=numbersOfFloors;
        this.electricityConsumptionInKWH=electricityConsumptionInKWH;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getNumbersOfFloors() {
        return numbersOfFloors;
    }

    public int getElectricityConsumptionInKWH() {
        return electricityConsumptionInKWH;
    }

    @Override
    public double getCarbonFootPrint() {
        return getElectricityConsumptionInKWH()*0.4;
    }

    @Override
    public String toString() {
        return String.format("Building Number: %d%nNumbers of floors: %d%nElectricity consumption: %dkWh%n",getBuildingNumber(),getNumbersOfFloors(),getElectricityConsumptionInKWH());
    }
}
