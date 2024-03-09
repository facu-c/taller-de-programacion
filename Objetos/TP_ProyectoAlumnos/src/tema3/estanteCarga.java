/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.Lector;

public class estanteCarga {

    public static void main(String[] args) {
        int i=0;
        Libro []libro = new Libro[20];
        Estante estante = new Estante();
        do{
            libro[i] = new Libro();            
            libro[i].setTitulo(Lector.leerString());
            libro[i].setEditorial(Lector.leerString());
            libro[i].setAñoEdicion(Lector.leerInt());
            estante.setLibro(libro[i]);
            i++;
        } while(i<20 && libro[i].getTitulo().equals("ZZZ"));
        
    }
    
}
