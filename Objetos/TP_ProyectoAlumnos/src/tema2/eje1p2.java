package tema2;

import PaqueteLectura.Lector;

public class eje1p2 {

    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.print("Ingrese el nombre de la persona: ");
        persona.setNombre(Lector.leerString());
        System.out.print("Ingrese el dni de la persona: ");
        persona.setDNI(Lector.leerInt());
        System.out.print("Ingrese la edad de la persona: ");
        persona.setEdad(Lector.leerInt());
        System.out.println(persona.toString());
    }
    
}
