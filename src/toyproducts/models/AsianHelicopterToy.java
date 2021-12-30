package toyproducts.models;
import toyproducts.Toy;

public class AsianHelicopterToy implements Toy{

    private final Integer serialNumber;
    private final String type = "helicoptero";

    public AsianHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void pack() {
        System.out.println("Empaquetando " + type + " con sn: " + serialNumber);
    }

    public void label() {
        System.out.println("Etiquetando " + type + " con sn: " + serialNumber);
    }

    @Override
    public int getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }
}
