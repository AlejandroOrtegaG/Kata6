package toys;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SerialNumberGenerator sng = new SerialNumberGenerator();
        ToyBusiness toyBusiness = new ToyBusiness();

        ArrayList<Car> coches = new ArrayList<>();
        ArrayList<Helicopter> helicopteros = new ArrayList<>();

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

                    coches.add(toyBusiness.createCar());

                    break;
                case "helicopter":

                    helicopteros.add(toyBusiness.createHelicopter());

                    break;

            }
        }
    }
}
