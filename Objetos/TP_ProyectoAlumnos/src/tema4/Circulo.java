/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author facundo
 */
public class Circulo extends Figura{
    private double radio;
    
    //Constructor
    public Circulo(double radio, String colorR, String colorL){
        super(colorR, colorL);
        this.setRadio(radio);
    }
    
    //Setters
    public void setRadio(double radio){
        this.radio = radio;
    }
    //getters
    public double getRadio(){
        return this.radio;
    }
    //metodos
    public double calcularArea(){
        double R= this.getRadio()*2;
        return R*Math.PI;
    }
    public double calcularPerimetro(){
        return this.getRadio() * 2;
    }
    
    //toString
    public String toString(){
        return super.toString();
    }
}
