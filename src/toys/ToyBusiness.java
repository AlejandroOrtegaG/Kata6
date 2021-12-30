package toys;

public class ToyBusiness {

    final private SerialNumberGenerator sng = new SerialNumberGenerator();

    public Car createCar() {

        Car coche = new Car(sng.next());
        coche.pack();
        coche.label();

        return coche;
    }

    public Helicopter createHelicopter() {
        Helicopter helicoptero = new Helicopter(sng.next());
        helicoptero.pack();
        helicoptero.label();

        return helicoptero;
    }
}
