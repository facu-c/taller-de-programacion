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
public class Entrenador extends Empleado{
    private int campeonatos;
    //constructor
    public Entrenador(String nombre, double sueldo, int antiguedad, int campeonatos){
        super(nombre, sueldo, antiguedad);
        this.setCampeonatos(campeonatos);
    }
    //Getters y setters
    public void setCampeonatos(int campeonatos){
        this.campeonatos = campeonatos;
    }
    public int getCampeonatos(){
        return this.campeonatos;
    }
    //metodos abstractos
    public double calcularEfectividad(){
        return this.getCampeonatos() / getAntiguedad();
    }
    public double calcularSueldoACobrar(){
        double aux = getSueldo() * 1.10;
        if(this.campeonatos > 10) aux += 50.000;
        else if(this. campeonatos > 5 && this.campeonatos < 10) aux += 30.000;
        else if(this.campeonatos > 1) aux += 5000;
        return getSueldo() + aux;
    }
}
