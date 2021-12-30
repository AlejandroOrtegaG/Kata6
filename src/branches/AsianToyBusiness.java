package branches;

import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness{

    @Override
    public Toy createToy(String type) {
        switch (type) {
            
            default:
                
                return null;

            case "car":

                AsianCarToy coche = new AsianCarToy(this.sng.next());
                coche.pack();
                coche.label();
                return coche;

            case "helicopter":

                AsianHelicopterToy helicoptero = new AsianHelicopterToy(this.sng.next());
                helicoptero.pack();
                helicoptero.label();
                return helicoptero;
        }
    }
}
