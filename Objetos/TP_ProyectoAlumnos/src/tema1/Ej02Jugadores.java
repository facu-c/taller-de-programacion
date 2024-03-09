
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;

public class Ej02Jugadores {

  
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
        double [] altura = new double[15];
        //Paso 3: Crear el vector para 15 double 

        //Paso 4: Declarar indice y variables auxiliares a usar
        int i,cant=0; double alt,promedio=0,suma=0; 
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for (i=0; i<4; i++){
            System.out.println("Ingrese la altura: ");
            alt = Lector.leerDouble();
            altura[i]=alt;
            suma += alt;
        }
        promedio = suma/i;
        //Paso 7: Calcular el promedio de alturas, informarlo
        System.out.println("Altura promedio: "+promedio);
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
     for (int j=0; j<4; j++){
         if(altura[j]>promedio){
             cant++;
         }
     }
        //Paso 9: Informar la cantidad.
        System.out.println("Cantidad mayores al promedio: "+cant);
    }
    
}
