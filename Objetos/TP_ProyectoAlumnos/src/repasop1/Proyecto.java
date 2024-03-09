/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasop1;
import PaqueteLectura.Lector;
public class Proyecto {
    private String nombre;
    private int codigo;
    private String nombreDirector;
    private Investigador [] investigador = new Investigador[50];
    private int diml=0;
    //Constructor
    public Proyecto(String nombre, int codigo, String director){
        setNombre(nombre);
        setCodigo(codigo);
        setNombreDirector(director);
    }
    //Getters and setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }
    
    //metodos
    public void agregarInvestigador(Investigador inve){
        Investigador i = inve;
        investigador[diml]=i;
        diml++;
    }
    public double dineroTotalOtorgado(){
        double total=0;
        for(int i=0; i<diml; i++){
            total += investigador[i].getTotalSubsidios();
        }
        return total;
    }
    //toString
    public String toString(){
        String aux = "Nombre del proyecto: " + this.getNombre() + ", codigo: "+this.getCodigo() + ", nombre del Director: " + this.getNombreDirector()+"\n";
        for(int i=0; i<diml; i++){
            aux += "Nombre del investigador: " +  investigador[i].getNombre() + ", categoria: " + investigador[i].getEspecialidad() + ", dinero total: " + investigador[i].getTotalSubsidios();
        }
        return aux;
    }
}
