/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasop1;

/**
 *
 * @author facundo
 */
public class Subsidio {
    private double monto;
    private String motivo;
    private boolean otorgado=false;
    //constructor
    public Subsidio(double monto, String motivo){
        setMonto(monto);
        setMotivo(motivo);
    }
    //Getters and setters
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public void setOtorgado(boolean otorgado){
        this.otorgado = otorgado;
    }
    public double getMonto(){
        return this.monto;
    }
    public boolean getOtorgado(){
        return this.otorgado;
    }
}
