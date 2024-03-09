/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasop1;
import PaqueteLectura.Lector;

public class Investigador {
    private String nombre;
    private int categoria;
    private String especialidad;
    private Subsidio [] subsidio = new Subsidio[5];
    private int diml=0;
    //Constructor
    public Investigador(String nombre, int categoria, String especialidad){
        setNombre(nombre);
        setCategoria(categoria);
        setEspecialidad(especialidad);
    }
    //Getters and setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    //Metodo
    public double getTotalSubsidios(){
        double total = 0;
        for(int i=0; i<diml; i++){
            if(subsidio[i].getOtorgado()) total += subsidio[i].getMonto();
        }
        return total;
    }
    public void agregarSubsidio(){
        System.out.println("Agregar Motivo: ");
        String motivo = Lector.leerString();
        System.out.println("Agregar Monto: ");
        double monto = Lector.leerDouble();
        Subsidio s = new Subsidio(monto,motivo);
        subsidio[diml]=s;
        subsidio[diml].setOtorgado(fueOtorgado());
        diml++;
    }
    public boolean fueOtorgado(){
        System.out.println("1: Otorgado. 0: No otorgado");
        boolean otorgado=false;
        int i = Lector.leerInt();
        if(i == 1) otorgado = true;
        return otorgado;
    }
    public void otorgarTodos(){
        for(int i=0; i<diml; i++){
            subsidio[i].setOtorgado(true);
        }
    }
}
