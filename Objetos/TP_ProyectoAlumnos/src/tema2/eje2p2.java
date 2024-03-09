package tema2;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
public class eje2p2 {


    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
       
        Persona []persona = new Persona[15];
        int df=0,edad,dni;
        String nombre;
        edad = GeneradorAleatorio.generarInt(99);
        dni = GeneradorAleatorio.generarInt(300);
        nombre = GeneradorAleatorio.generarString(5);
        while(df<15 && edad != 0){
            edad = GeneradorAleatorio.generarInt(99);
            dni = GeneradorAleatorio.generarInt(300);
            nombre = GeneradorAleatorio.generarString(5);
            Persona p = new Persona();
            p.setNombre(nombre);
            p.setDNI(dni);
            p.setEdad(edad);
            persona[df]=p;
            /*No se puede hacer hacer persona[df].setNombre(nombre);
            creo que por esto de que son referencias memoria y no en sí las variables
            */
            df++;
        }
        int cant=0;
        for(int i=0;i<df;i++){
            if(persona[i].getEdad()>65){
                cant++;
            }
        }
        System.out.println("Cant de personas mayores a 65: "+cant);
        int min=9999;
        Persona personaMin = new Persona();
        for(int i=0;i<df;i++){
            if(persona[i].getDNI()<min){
                min = persona[i].getDNI();
                personaMin = persona[i];
            }
        }
        System.out.println("Menor DNI: "+personaMin.toString());
    }
    
}
