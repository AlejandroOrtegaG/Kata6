package toys;

import java.util.ArrayList;
import java.util.Scanner;
import toyproducts.Toy;
import toys.*;

public class Main {

    public static void main(String[] args) {

        ToyBusiness toyBusiness = new ToyBusiness();

        ArrayList<Toy> toys = new ArrayList<>();

        System.out.println("Introduzca una orden (exit para salir):");
        Scanner s = new Scanner(System.in);
        String instruccion = "";

        while (!instruccion.equals("exit")) {
            instruccion = s.nextLine();
            
            switch (instruccion) {
            default:
                System.out.println("Command unknown!");
                break;
                
            case "car":
                
                toys.add(toyBusiness.createToy(instruccion));
                break;
                
            case "helicopter":

                toys.add(toyBusiness.createToy(instruccion));
                break;
                
            }
        }
    }
}
