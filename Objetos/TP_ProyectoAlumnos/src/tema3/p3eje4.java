
package tema3;

import PaqueteLectura.Lector;
public class p3eje4 {


    public static void main(String[] args) {
        int cantHabitaciones;
        Persona persona;
        System.out.println("Ingrese la cantidad de habitaciones");
        cantHabitaciones = Lector.leerInt();
        Hotel hotel = new Hotel(cantHabitaciones);
        for(int i=0; i<cantHabitaciones; i++){
            int habitacion;
            persona = new Persona();
            System.out.println("Ingrese el nombre de la persona: ");
            persona.setNombre(Lector.leerString());
            System.out.println("Ingrese la edad de la persona: ");
            persona.setEdad(Lector.leerInt());
            System.out.println("Ingrese el dni de la persona: ");
            persona.setDNI(Lector.leerInt());
            System.out.println("En que habitacion desea ingresarlo: ");
            habitacion = Lector.leerInt();
            hotel.setClienteHabitacion(persona, habitacion);
        }
        System.out.println();
        System.out.println(hotel.toString());
        double aumento;
        System.out.println("Ingrese el aumento: ");
        aumento = Lector.leerDouble();
        hotel.setAumentoHabitacion(aumento);
        System.out.println();
        System.out.println(hotel.toString());
    }
    
}
