/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;
import PaqueteLectura.GeneradorAleatorio;
public class Ej01Tabla2 {

    /**
     * Carga un vector que representa la tabla del 2
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int DF=11;  
        int [] tabla2 = new int[DF]; // indices de 0 a 10
        int [] tabla = new int[DF];
        int i;
        for (i=0;i<DF;i++) 
            tabla2[i]=2*i;
        System.out.println("2x" + "5" + "="+ tabla2[5]);
        System.out.println("**********************");
        i=1;
        while(i<=DF && tabla[i] != 11){
            tabla[i] = GeneradorAleatorio.generarInt(12);
            System.out.println("Posicion: "+i+", dato: "+tabla[i]);
            System.out.println("Multiplicado por 2: "+tabla[i]*2);
            i++;
        }
        System.out.println("***********************");
        
    }
    
}
