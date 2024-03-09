package tema3;
import PaqueteLectura.GeneradorAleatorio;
public class Hotel {
    //Estado
    private int dimF;
    private Habitacion [] habitacion;
    //Constructor
    public Hotel(int n){
        habitacion = new Habitacion[n];
        this.dimF = n;
        //GeneradorAleatorio
        GeneradorAleatorio.iniciar();
        for(int i=0; i<n; i++){
            this.habitacion[i] = new Habitacion(GeneradorAleatorio.generarInt(1000));
        }
    }
    //Metodos
    public void setClienteHabitacion(Persona persona, int N){
        this.habitacion[N].setCliente(persona);
        this.habitacion[N].setOcupacion(true);
    }
    public void setAumentoHabitacion(double monto){
        for(int i=0; i<dimF; i++){
            this.habitacion[i].setCostoHabitacion(monto + this.habitacion[i].getCostoHabitacion());
        }
    }
    @Override
    public String toString(){
        for(int i=0; i<=dimF; i++){
            return "Habitacion: "+i+", informacion: "+this.habitacion[i].toString();
        }
        return "listo";
    }
    
    
}
