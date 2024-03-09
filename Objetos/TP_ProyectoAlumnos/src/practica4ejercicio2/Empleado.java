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
public abstract class Empleado {
    private String nombre;
    private double sueldo;
    private int antiguedad;
    //constructor
    public Empleado(String nombre, double sueldo, int antiguedad){
        setNombre(nombre);
        setSueldo(sueldo);
        setAntiguedad(antiguedad);
    }
    //Getters y setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public int getAntiguedad(){
        return this.antiguedad;
    }
    //metodos abstractos
    public abstract double calcularEfectividad();
    public abstract double calcularSueldoACobrar();
    //toString
    public String toString(){
        return "Nombre: "+this.getNombre()+", sueldo: "+this.calcularSueldoACobrar()+", efectividad : "+ this.calcularEfectividad();
    }
}
