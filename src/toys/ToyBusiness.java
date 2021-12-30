package toys;

import toyproducts.Toy;
import toyproducts.models.HelicopterToy;
import toyproducts.models.CarToy;

public class ToyBusiness {

    final private SerialNumberGenerator sng = new SerialNumberGenerator();

    public Toy createToy(String type) {
        switch (type) {
            default:
                return null;
                
            case "car":

                CarToy coche = new CarToy(sng.next());
                coche.pack();
                coche.label();
                return coche;

            case "helicopter":

                HelicopterToy helicoptero = new HelicopterToy(sng.next());
                helicoptero.pack();
                helicoptero.label();
                return helicoptero;
        }
    }
}
