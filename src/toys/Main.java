package toys;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator sng = new SerialNumberGenerator();
        ArrayList<Car> coches = new ArrayList<>();
        ArrayList<Helicopter> helicopteros = new ArrayList<>();
        
        System.out.println("Introduzca una orden (exit para salir):");
        Scanner s = new Scanner(System.in);
        String instruccion = "";
        while(!instruccion.equals("exit")){
            instruccion=s.nextLine();
            
            switch(instruccion){
                default:
                    System.out.println("Command unknown!");
                    break;
                case "car":
                    Car coche = new Car(sng.next());
            
                    coche.pack();
                    coche.label();
            
                    coches.add(coche);
                    break;
                case "helicopter":
                    Helicopter helicoptero = new Helicopter(sng.next());
            
                    helicoptero.pack();
                    helicoptero.label();
            
                    helicopteros.add(helicoptero);
                    break;
                    
            }
        }
    }
}
