package branches;

import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness {

    @Override
    public Toy createToy(String type) {
        switch (type) {
            default:
                return null;

            case "car":

                AmericanCarToy coche = new AmericanCarToy(sng.next());
                coche.pack();
                coche.label();
                return coche;

            case "helicopter":

                AmericanHelicopterToy helicoptero = new AmericanHelicopterToy(sng.next());
                helicoptero.pack();
                helicoptero.label();
                return helicoptero;
        }
    }
}
