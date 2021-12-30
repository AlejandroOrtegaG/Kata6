package toys;

public class Car {
    
    private final Integer serialNumber;
    
    public Car (Integer serialNumber){
        this.serialNumber = serialNumber;
    }
    
    public void pack (){
        System.out.println("Empaquetando coche con sn: " + serialNumber);
    }
    
    public void label (){
        System.out.println("Etiquetando coche con sn: " + serialNumber);
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }
}
