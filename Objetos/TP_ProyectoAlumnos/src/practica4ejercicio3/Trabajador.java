/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4ejercicio3;

/**
 *
 * @author facundo
 */
public class Trabajador extends Persona{
    private String profesion;
    //constructor
    public Trabajador(String nombre, int dni, int edad, String profesion){
        super(nombre, dni, edad);
        setProfesion(profesion);
    }
    //getter y setters
    public void setProfesion(String profesion){
        this.profesion = profesion;
    }
    public String getProfesion(){
        return this.profesion;
    }
    //toString
    public String toString(){
        return super.toString()+". Soy "+this.getProfesion();
    }
}
