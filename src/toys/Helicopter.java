package toys;

public class Helicopter {

    private final Integer serialNumber;
    private final String type = "helicoptero";

    public Helicopter(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void pack() {
        System.out.println("Empaquetando " + type + " con sn: " + serialNumber);
    }

    public void label() {
        System.out.println("Etiquetando " + type + " con sn: " + serialNumber);
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }
}
