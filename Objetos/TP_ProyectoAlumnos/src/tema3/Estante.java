/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author facundo
 */
public class Estante {
    private Libro []libro = new Libro[20];
    private int dimL=0;
    //Constructores
    public Estante(){
        
    }
    //Setter y Getters
    public void setLibro(Libro l){
        libro[dimL] = l;
        dimL++;
    }
    //Metodos
    public int cantLibros(){
        return dimL;
    }
    public boolean estanteLleno(){
        return dimL==19;
    }
    public Libro devolverLibro(String titulo){
        int i=0;
        while(i<dimL && titulo != libro[i].getTitulo()){
            i++;
        } 
        return libro[i];
    }
}
