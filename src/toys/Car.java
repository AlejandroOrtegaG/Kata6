package toys;

public class Car {

    private final Integer serialNumber;
    private final String type = "coche";

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void pack() {
        System.out.println("Empaquetando " + type + " con sn: " + serialNumber);
    }

    public String getType() {
        return type;
    }

    public void label() {
        System.out.println("Etiquetando " + type + " con sn: " + serialNumber);
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }
}
