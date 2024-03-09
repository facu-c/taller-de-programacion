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
public class Triangulo extends Figura{
    private int lado1;
    private int lado2;
    private int lado3;
    //Constructor
    public Triangulo(int lado1, int lado2, int lado3, String color1, String color2){
        super(color1, color2);
        this.setLadoUno(lado1);
        this.setLadoDos(lado2);
        this.setLadoTres(lado3);
    }
    //Setters
    public void setLadoUno(int lado){
        this.lado1 = lado;
    }
    public void setLadoDos(int lado){
        this.lado2 = lado;
    }
    public void setLadoTres(int lado){
        this.lado3 = lado;
    }
    //Getters
    public int getLadoUno(){
        return this.lado1;
    }
    public int getLadoDos(){
        return this.lado2;
    }
    public int getLadoTres(){
        return this.lado3;
    }
    //Metodos
    public double calcularArea(){
        return lado1 + lado2 + lado3;
    }
    public double calcularPerimetro(){
        return lado1 + lado2 + lado3;
        
    }
    //toString
    public String toString(){
        String aux = super.toString() + "Lado 1: "+this.getLadoUno()+", lado 2: "+this.getLadoDos()+", lado 3: "+this.getLadoTres();
        return aux;
    }
}
