
package tema3;


public class Habitacion {
    private double costo;
    private boolean ocupada=false;
    private Persona persona = new Persona();
    //Constructores
    public Habitacion(double costo){
        this.costo=costo;
    }
    //Setters y Getters
    public void setCliente(Persona persona){
        this.persona = persona;
    }
    public void setCostoHabitacion(double costo){
        this.costo = costo;
    }
    public void setOcupacion(boolean x){
        this.ocupada = x;
    }
    public double getCostoHabitacion(){
        return this.costo;
    }
    
    //toString
    public String toString(){
        return  "Costo: "+this.costo +", situación: "+this.ocupada+", cliente: "+this.persona.toString();
    }
}
