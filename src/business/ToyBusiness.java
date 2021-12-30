package business;

import toyproducts.Toy;
import toys.SerialNumberGenerator;

public abstract class ToyBusiness {

    public final SerialNumberGenerator sng = new SerialNumberGenerator();

    public abstract Toy createToy(String type);
}