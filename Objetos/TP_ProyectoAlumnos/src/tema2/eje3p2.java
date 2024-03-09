
package tema2;
import PaqueteLectura.GeneradorAleatorio;

public class eje3p2 {


    public static void main(String[] args) {
        Persona[][] persona = new Persona[5][8];
        int i = 0;
        boolean flag = true;

        while (i < 5 && flag) {
            int j = 0; // Move the initialization of 'j' inside the outer loop
            while (j < 8 && flag) {
                Persona p = new Persona(); // Create a new Persona object in each iteration
                p.setDNI(GeneradorAleatorio.generarInt(300));
                p.setNombre(GeneradorAleatorio.generarString(3));
                p.setEdad(GeneradorAleatorio.generarInt(99));

                if (p.getNombre().equals("ZZZ")) {
                    flag = false;
                }

                persona[i][j] = p;
                j++;
            }
            i++;
        }
        flag = true;
        i = 0;
        while (i < 5 && flag) {
           int j = 0;
            while (j < 8 && flag) {
                if (!persona[i][j].getNombre().equals("ZZZ")) {
                    System.out.println("Dia: " + i + ", nombre: " + persona[i][j].getNombre());
                } else {
                    flag = false; // Set flag to false to break out of the loop
                }
                j++;
            }
            i++;
        }
        
    }
    
}
