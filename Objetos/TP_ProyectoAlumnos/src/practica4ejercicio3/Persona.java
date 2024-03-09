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
public abstract class Persona {
    private String nombre;
    private int dni;
    private int edad;
   //constructor
    public Persona(String nombre, int dni, int edad){
        setNombre(nombre);
        setDNI(dni);
        setEdad(edad);
    }
    //Setter y getters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDNI(int dni){
        this.dni = dni;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getDNI(){
        return this.dni;
    }
    public int getEdad(){
        return this.edad;
    }
    //toString
    public String toString(){
        return "Mi nombre es: "+getNombre()+", mi DNI es: "+getDNI()+" y tengo: "+getEdad();
    }
    
}
