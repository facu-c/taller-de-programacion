/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4ejercicio2;

/**
 *
 * @author facundo
 */
public class Jugador extends Empleado{
    private int partidos;
    private int goles;
    //Constructor
    public Jugador(String nombre, double sueldo, int antiguedad, int partidos, int goles){
        super(nombre, sueldo, antiguedad);
        setGoles(goles);
        setPartidos(partidos);
    }
    //Getters y setters
    public void setPartidos(int partidos){
        this.partidos = partidos;
    }
    public void setGoles(int goles){
        this.goles = goles;
    }
    public int getPartidos(){
        return this.partidos;
    }
    public int getGoles(){
        return this.goles;
    }
    //metodos heredados
    public double calcularEfectividad(){
        return this.getGoles() / this.getPartidos();
    }
    public double calcularSueldoACobrar(){
        double aux = 1.10 * getAntiguedad();
        if((this.getGoles() / this.getPartidos()) > 0.5 ){
            aux += getSueldo();
        }
        return aux;
    }
}
