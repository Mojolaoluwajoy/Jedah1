package chapter11.exercises.customEception;

public class Phone {
    private String name;
    private String serialNumber;

    public Phone(String name,String serialNumber){
        if (name.isEmpty()|| serialNumber.isEmpty()){
            throw new ValidationException("Name and/or serial number cannot be empty");
        }
        if (serialNumber.length()!=16){
            throw new ValidationException("The serial Number must be 16! ");
        }
        this.name=name;
        this.serialNumber=serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return String.format("name: %s%nserialNumber:%s%n",getName(),getSerialNumber());
    }
}
