/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String colorLinea;
    private String colorRelleno;
    //Constructores
    public Triangulo(double ladoUno, double ladoDos, double ladoTres, String colorDeLinea, String colorDeRelleno){
        lado1 = ladoUno;
        lado2 = ladoDos;
        lado3 = ladoTres;
        colorLinea = colorDeLinea;
        colorRelleno = colorDeRelleno;
    }
    public Triangulo(double ladoUno, double ladoDos, double ladoTres){
        lado1= ladoUno;
        lado2 = ladoDos;
        lado3 = ladoTres;
    }
    public Triangulo(){
        
    }
    //Getters y Setters
    public double getLadoUno(){
        return lado1;
    }
    public double getLadoDos(){
        return lado2;
    }
    public double getLadoTres(){
        return lado3;
    }
    public String getLinea(){
        return colorLinea;
    }
    public String getRelleno(){
        return colorRelleno;
    }
    
    public void setLadoUno(double ladoUno){
        lado1 = ladoUno;
    }
    public void setLadoDos (double ladoDos){
        lado2 = ladoDos;
    }
    public void setLadoTres(double ladoTres){
        lado3 = ladoTres;
    }
    //Metodos
    public double calculrPerimetro(){
        return lado1 + lado2 + lado3;
    }
    public double calcularArea(){
        double auxUno = (lado1 + lado2 + lado3)/2;
        double auxDos = (auxUno*(auxUno-lado1)*(auxUno-lado2)*(auxUno-lado3));
        return Math.sqrt(auxDos);
    }
}
