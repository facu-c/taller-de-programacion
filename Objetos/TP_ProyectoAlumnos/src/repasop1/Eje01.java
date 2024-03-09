/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasop1;

import PaqueteLectura.Lector;
public class Eje01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0;
        System.out.println("Ingrese el nombre del proyecto: ");
        String nombreProyecto = Lector.leerString();
        System.out.println("Ingrese el codigo del proyecto: ");
        int codigoProyecto = Lector.leerInt();
        System.out.println("Ingrese el director del proyecto: ");
        String director = Lector.leerString();
        Proyecto proyecto = new Proyecto(nombreProyecto, codigoProyecto, director);
        System.out.println();
        System.out.println("Ingrese el nombre del primer investigador: ");
        String nombreInvestigador = Lector.leerString();
        while(i<50 && !nombreInvestigador.equals("ZZZ")){
            System.out.println("Ingrese la categoria del investigador: ");
            int categoria = Lector.leerInt();
            System.out.println("Ingrese la especialidad del investigador: ");
            String especialidad = Lector.leerString();
            Investigador investigador = new Investigador(nombreInvestigador,categoria,especialidad);
            System.out.println();
            System.out.println("Ingrese los subsidios del investigador");
            System.out.println();
            System.out.println("Primer subsidio. ");
            int sub = 1;
            while(sub == 1){
                investigador.agregarSubsidio();
                System.out.println("Desea agregar otro subsidio");
                System.out.println("1: SÍ. 2: NO.");
                sub = Lector.leerInt();
                System.out.println();
            }
            proyecto.agregarInvestigador(investigador);
            i++;
            System.out.println("Ingrese el nombre del investigador: ");
            nombreInvestigador = Lector.leerString();
        }
        System.out.println(proyecto.toString());
    }
    
}
