/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import PaqueteLectura.Lector;
public class p4eje1 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese el radio del circulo: ");
        int radio = Lector.leerInt();
        System.out.println("Ingrese el color de la linea: ");
        String linea = Lector.leerString();
        System.out.println("Ingrese el color del relleno");
        String relleno = Lector.leerString();
        Circulo circulo = new Circulo(radio,relleno,linea);
        System.out.println(circulo.toString());
        circulo.despintar();
        System.out.println(circulo.toString());
    }
    
}
